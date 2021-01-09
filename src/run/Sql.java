package run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import player.Players;

import Frame.mapFrame2;

public class Sql {

	/**
	 * @param args
	 */
	String username;
	String password;
	public static Statement sta;
	public static PreparedStatement ps;
	public static Connection conn;
	public static int count;

	public static void connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/monopoly", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void connectionServer(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://58.87.109.119:3306/monopoly", "root", "123456");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Sql() {

	}

	public Sql(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static void setuser(String username, String password) {

		try {
			String sql = "insert into player(name,password) values('" + username + "','"
					+ password + "')";
			sta = conn.createStatement();
			count = sta.executeUpdate(sql);
			if (count != 0) {
				//System.out.println("上传成功！");
			} else {
				//System.out.println("上传失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static String getUsername(String username) {
		String s = "no";
		String s1 = "yes";
		String sql = "select * from player";
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next() == true) {
				if (rs.getString("username").equalsIgnoreCase(username)) {
					return s1;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	public static String getPassword(String username) {
		String s = null;
		String sql = "select * from player where username = '" + username
				+ "';";
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next() == true) {
				s = rs.getString("password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	public static int getMoney(int orders) {// 每次摇色子后都获取一下该id下的兵力并显示在面板上，如果小于0则跳出面板
		// 你输了 人机自动摇色子的时候也调用一下吧
		int money = 0;
		String sql = "select money from player where orders = " + orders;
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				money = rs.getInt("money");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return money;
	}
	public static String getIdMoney(int id) {
		//用于文本框显示的getmoney
		String money = null;
		String sql = "select money from player where id = " + id;
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				money = rs.getString("money");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return money;
	}
	public static String getRoleMoney(int role) {
		//用于文本框显示的getmoney
		String money = null;
		String sql = "select money from player where role = " + role;
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				money = rs.getString("money");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return money;
	}
	
	public static int getOneOut(int id) {// 每次摇色子后都获取一下该id下的兵力并显示在面板上，如果小于0则跳出面板
		// 你输了 人机自动摇色子的时候也调用一下吧
		String sql = "select money from player where id = " + id;
		
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt("money")<=0){
					String sql1 = "update player set YorNout=0 where id = "+id;
					int count = sta.executeUpdate(sql1);
					if (count != 0) {
						//System.out.println("上传成功");
					} else {
						//System.out.println("失败");
					}
					return 2;//你输了
				}
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;//你还活着
	}

	// 火烧联营 判断除自己外的其他人有没有被淘汰如果全部被淘汰则返回胜利
	public static int getOut1(int id) {
		int result=2;
		String sql = "SELECT YorNout FROM player WHERE orders NOT IN (0) AND id NOT IN(" + id + ")";// 传入自己的id
		// 查询除自己id外的其他人的兵力
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				if (rs.getInt("YorNout")==1) {// 如果有1则说明除你之外还有人活着
					result = 1;
				}	
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;// 如果都为0返回2 得出结果 我赢了
	}

	// 三英战吕布的地图输赢判断
	public static int getOut2() {
		int result = 0;
		String sql = "select money from player where name = 'lvbu'";
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				int money = rs.getInt("money");
				if (money >= 10000) {
					result = 1;// /吕布大于10000 返回1 吕布胜利
					String sql1 = "update player set YorNout=0 where name NOT IN('lvbu')";
					int count = sta.executeUpdate(sql1);
					return result;
				} else if (money <= 0) {
					String sql2 = "update player set YorNout=0 where name='lvbu'";
					int count2 = sta.executeUpdate(sql2);
					result = 2;// 吕布小于0返回2 三英胜利
					return result;
				}
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	

	public static void initialization() throws SQLException {
		String sql1 = "update player set position=1,money = 10000,orders='0',YorNout=1,type=2";// 初始化的时候应该是初始化所有的人包括人机
		String sql2 = "update round set orders='1',dice = 0,over=1,position=1,start=0";
		String sql3 = "update player set type=1 where id=1";
		PreparedStatement ptmt = conn.prepareStatement(sql1);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql2);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql3);
		ptmt.execute();
	}
	public static void initializationPerson() throws SQLException {
//		String sql1 = "update player set position=1,money = 10000,orders='0',YorNout=1,type=1";// 初始化的时候应该是初始化所有的人包括人机
//		String sql2 = "update round set orders='1',dice = 0,over=1,position=1,start=0";
//		PreparedStatement ptmt = conn.prepareStatement(sql1);
//		ptmt.execute();
//		ptmt = conn.prepareStatement(sql2);
//		ptmt.execute();

	}
	public static void initializationServer() throws SQLException {
		String sql1 = "update player set position=1,money = 10000,orders='0',YorNout=1";// 初始化的时候应该是初始化所有的人包括人机
		String sql2 = "update round set orders='0',dice = 0,over=1,position=1,start=0";
		PreparedStatement ptmt = conn.prepareStatement(sql1);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql2);
		ptmt.execute();
	}

	public static void type() throws SQLException {
		int orders = 1, id;
		int playernumber=0;
		String sql1 = "select id from player where type=1";
		String sql2 = "select id from player where type=2";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql1);

		while (rs.next()) {
			id = rs.getInt("id");
			String sql3 = "update player set orders='" + orders
					+ "' where id='" + id + "'";
			PreparedStatement ptmt = conn.prepareStatement(sql3);
			ptmt.execute();
			orders++;
			playernumber++;
		}
		rs = sta.executeQuery(sql2);
		while (rs.next()) {
			id = rs.getInt("id");
			String sql3 = "update player set orders='" + orders
					+ "' where id='" + id + "'";
			PreparedStatement ptmt = conn.prepareStatement(sql3);
			ptmt.execute();
			orders++;
			playernumber++;
		}
		setPlayerNumber(playernumber);
	}
	public static void typeServer() throws SQLException {
		int orders = 1, id;
		int playernumber=0;
		String sql1 = "select id from player where online=1";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql1);

		while (rs.next()) {
			id = rs.getInt("id");
			String sql2 = "update player set orders='" + orders
					+ "' where id='" + id + "'";
			PreparedStatement ptmt = conn.prepareStatement(sql2);
			ptmt.execute();
			orders++;
			playernumber++;
		}

		setPlayerNumber(playernumber);
	}
	public  int  getServerOrders() throws SQLException{
		String sql = "select orders from round ";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("orders");
		}
		return 0;
	}
	public  int  getPlayerOrders() throws SQLException{
		//zzj要改为自己的id
		String sql = "select orders from player where username='"+Players.username+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			
			return rs.getInt("orders");
		}
		return 0;
	}
	public  int  getDice() throws SQLException{
		String sql = "select dice from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("dice");
		}
		return 0;
	}
	public static void  setDice(int dice) throws SQLException{
		String sql = "update round set dice="+dice;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public static void  setOrders(int Orders) throws SQLException{
		String sql = "update round set Orders="+Orders;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public static void  setOver(int over) throws SQLException{
		String sql = "update round set over="+over;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public  int  getOver() throws SQLException{
		String sql = "select over from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("over");
			
		}
		rs.close();
		return 0;
		
	}
	public  int  getPlayerNumber() throws SQLException{
		String sql = "select playernumber from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("playernumber");
		}
		rs.close();
		return 0;
		
	}
	public static void  setPlayerNumber(int playernumber) throws SQLException{
		String sql = "update round set playernumber="+playernumber;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}	
	public  int  getPosition() throws SQLException{
		String sql = "select position from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("position");
		}
		rs.close();
		return 0;
		
	}
	public static void  setPosition(int position) throws SQLException{
		String sql = "update round set position="+position;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}	
	public  int  getStop(int orders) throws SQLException{
		String sql = "select stop from player where orders="+orders;
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("stop");
		}
		rs.close();
		return 0;
		
	}
	public  void  setStop(int stop,int orders) throws SQLException{
		String sql = "update player set stop="+stop+" where orders="+orders;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}	
	public  void  setType(int type,int id) throws SQLException{
		String sql = "update player set type="+type+" where id="+id;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public void  setonline(int online,String username) throws SQLException{
		String sql = "update player set online="+online+" where username='"+username+"'";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public  int  getRole(String username) throws SQLException{
		String sql = "select role from player where username = '"+username+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("role");
		}
		return 0;
	}
	//通过顺序找人物
	public  int  getOrdersRole(int orders) throws SQLException{
		String sql = "select role from player where orders = '"+orders+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("role");
		}
		return 0;
	}
	public void  setRole(int role,String username) throws SQLException{
		String sql = "update player set role="+role+" where username='"+username+"'";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public  boolean selectAllRole(int role) {
		
		String sql = "select role from player ";
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt("role")==role){
					//当前角色已经被选择
					return false;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//当前角色还没被选择
		return true;
	}
	public boolean checkLastandFirstPlayer() throws SQLException{
		//当顺序为0的时候，其他玩家执行最后一名玩家的移动，而最后一名玩家不需要执行
		if(getServerOrders()==0&&getPlayerNumber()==getPlayerOrders()){
			return false;
		}
		return true;
	}
	public void  setstart(int start) throws SQLException{
		String sql = "update round set start="+start;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public  int  getstart() throws SQLException{
		String sql = "select start from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("start");
		}
		return 0;
	}
	public  int  getIdbyOrders(int orders) throws SQLException{
		String sql = "select id from player where orders = '"+orders+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("id");
		}
		return 0;
	}
	public void  setmap(int map) throws SQLException{
		String sql = "update round set map="+map;
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
	}
	public  int  getmap() throws SQLException{
		String sql = "select map from round";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("map");
		}
		return 0;
	}
	public void copyMap(int map) throws SQLException{
		String sql3 = "delete from land where 1=1";
		String sql4 = "insert into land select * from landsave"+map;
		PreparedStatement ptmt = conn.prepareStatement(sql3);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql4);
		ptmt.execute();
	}
	public void copyPlayer(int player) throws SQLException{
		String sql3 = "delete from player where 1=1";
		String sql4 = "insert into player select * from playersave"+player;
		PreparedStatement ptmt = conn.prepareStatement(sql3);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql4);
		ptmt.execute();
	}
	public int getPlayerposition(int id)throws SQLException{
		String sql = "select position from player where id="+id;
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("position");
		}
		return 0;
	}
	public void copyRound(int round) throws SQLException{
		String sql3 = "delete from round where 1=1";
		String sql4 = "insert into round select * from roundsave"+round;
		PreparedStatement ptmt = conn.prepareStatement(sql3);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql4);
		ptmt.execute();
	}
	public  int  getOwner(int position) throws SQLException{
		String sql = "select owner from land where position = '"+position+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getInt("owner");
		}
		return 0;
	}
	public static boolean register(String username,String password) throws SQLException{
		String sql="insert into player(username,password) values('"+username+"','"+password+"')";

		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.execute();
		return true;
		
	}
	public static  String  getUsername(int orders) throws SQLException{
		String sql = "select username from player where orders = '"+orders+"'";
		sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(sql);
		if(rs.next()){
			return rs.getString("username");
		}
		return null;
	}
	
}
