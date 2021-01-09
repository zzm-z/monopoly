package function;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import run.Sql;

public class GameFunction extends Sql {

	public static int dice() {
		/*
		 * 实现随机得出1-6某个数 调用该函数就可获得摇色子的值
		 */
		Random r = new Random();
		int R = r.nextInt(6) + 1;
		return R;
	}

	public void effectReduce() {
		/*
		 * 每个人物的技能效果，卡牌效果，战争令牌效果，监禁效果每回合减一
		 */
	}

	public static void prison(int orders) {
		/*
		 * 使人物停留在原格，使当前格的玩家stop属性+2
		 */
		try {
			String sql = "update player set stop = 2 where orders = " + orders;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
			if (count != 0) {
				//System.out.println("成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void prisonServer(int role) {
		/*
		 * 使人物停留在原格，使当前格的玩家stop属性+2
		 */
		try {
			String sql = "update player set stop = 2 where role = " + role;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
			if (count != 0) {
				//System.out.println("成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landUp(int money, int landGrades, int orders,
			int position) {
		/*
		 * 判断当前玩家的钱是否足够，不足够弹出提示不够兵力升级的弹窗，够兵力升级，就扣除当前玩家升级所需兵力，将当前领地等级+1
		 */

		landGrades++;

		try {

			String sql2 = "update land set level = " + landGrades
					+ " where position = " + position;
			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();//
			ResultSet rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// 得到金钱，并且扣1000用来升级
			}
			String sql1 = "update player set money = " + money
					+ " where orders = " + orders;
			int count1 = sta.executeUpdate(sql1);
			int count2 = sta.executeUpdate(sql2);
			if (count1 != 0 && count2 != 0) {
				//System.out.println("上传成功");
			} else {
				//System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void landUpServer(int money, int landGrades, int orders,
			int position) {
		/*
		 * 判断当前玩家的钱是否足够，不足够弹出提示不够兵力升级的弹窗，够兵力升级，就扣除当前玩家升级所需兵力，将当前领地等级+1
		 */

		landGrades++;

		try {

			String sql2 = "update land set level = " + landGrades
					+ " where position = " + position;
			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();//
			ResultSet rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// 得到金钱，并且扣1000用来升级
			}
			String sql1 = "update player set money = " + money
					+ " where orders = " + orders;
			int count1 = sta.executeUpdate(sql1);
			int count2 = sta.executeUpdate(sql2);
			if (count1 != 0 && count2 != 0) {
				//System.out.println("上传成功");
			} else {
				//System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landBuy(int orders) {
		/*
		 * 判断当前是否够兵力购买，不够就弹出不够兵力购买的弹窗，够就扣除购买所需兵力，并且将当前领地所属权改为当前玩家
		 */
		int position = 0;
		int money = 0;
		try {
			String sql = "select position from player where orders = " + orders;

			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			if (rs.next()) {
				position = rs.getInt("position");// 得到人物当前位置
			}
			String sql2 = "update land set owner = " + orders
					+ " where position = " + position;
			String sql4 = "update land set level = 1 where position = " + position;
			rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// 得到金钱
				//System.out.println(money);
			}
			String sqlmoney = "update player set money = " + money
					+ " where orders = " + orders;

			int count1 = sta.executeUpdate(sqlmoney);
			int count2 = sta.executeUpdate(sql2);
			int count3 = sta.executeUpdate(sql4);
			if (/* count1 != 0 && */count2 != 0) {
				//System.out.println("上传成功");
			} else {
				//System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public  void landBuyServer(int orders) {
		/*
		 * 判断当前是否够兵力购买，不够就弹出不够兵力购买的弹窗，够就扣除购买所需兵力，并且将当前领地所属权改为当前玩家
		 */
		int position = 0;
		int money = 0;
		try {
			String sql = "select position from player where orders = " + orders;

			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			if (rs.next()) {
				position = rs.getInt("position");// 得到人物当前位置
			}
			String sql2 = "update land set owner = " + orders
					+ " where position = " + position;
			String sql4 = "update land set level = 1 where position = " + position;
			rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// 得到金钱
				//System.out.println(money);
			}
			String sqlmoney = "update player set money = " + money
					+ " where orders = " + orders;

			int count1 = sta.executeUpdate(sqlmoney);
			int count2 = sta.executeUpdate(sql2);
			int count3 = sta.executeUpdate(sql4);
			if (/* count1 != 0 && */count2 != 0) {
				//System.out.println("上传成功");
			} else {
				//System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landFine(int orders, int position) {
		  /*
		   * 与不属于当前领地主人的玩家发生战斗，并且奴役一部分兵力，扣除当前领地需罚的相应兵力
		   */
		  int money = 0;

		  try {
		   int owner = 0;
		   int level = 0;
		   money = 0;
		   // 根据土地position查询土地等级以便后面用于扣钱和收钱
		   String sql3 = "select owner,level from land where position = "
		     + position;
		   String sql4 = "select money from player where orders = " + orders;
		   sta = conn.createStatement();
		   ResultSet rs = sta.executeQuery(sql3);

		   if (rs.next()) {
		    owner = rs.getInt("owner");// 得到所属者
		    level = rs.getInt("level");// 得到等级
		   }
		   rs = sta.executeQuery(sql4);
		   if (rs.next()) {
		    money = rs.getInt("money");// 得到金钱
		   }
		   if (level == 1) {
		    money = money - 1000;
		   } else if (level == 2) {
		    money = money - 2000;
		   } else {
		    money = money - 3000;
		   }
		   String sql1 = "update player set money = " + money
		     + " where orders = " + orders;// 减去过路者的钱
		   sta = conn.createStatement();
		   int count1 = sta.executeUpdate(sql1);
		   if (count1 != 0) {
		    //System.out.println("成功1");
		    String sql2 = "select money,YorNout from player where orders = "
		      + owner;// 查询地皮拥有者现有多少钱以便后面收租
		    sta = conn.createStatement();
		    ResultSet rs1 = sta.executeQuery(sql2);
		    if(rs.next()){
		     if(rs.getInt("YorNout")!=0){
		      int money1 = 0;
		      if (rs1.next()) {
		       money1 = rs1.getInt("money");
		      }
		      if (level == 1) {
		       money1 = money1 + 1000;
		      } else if (level == 2) {
		       money1 = money1 + 2000;
		      } else {
		       money1 = money1 + 3000;
		      }
		      String sql0 = "update player set money = " + money1
		        + " where orders = " + owner+"AND YorNout NOT IN(0)";// 地皮拥有者收钱
		      sta = conn.createStatement();
		      int count2 = sta.executeUpdate(sql0);
		      if (count2 != 0) {
		       System.out.println("成功2");
		      }
		     }else{
		      System.out.println("不用给失败的玩家支付！");
		     }
		    }
		    
		   }
		  } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }

		 }

	public void warCard() {
		/*
		 * 令战争令牌在地图上某个格子随机生成
		 */
	}

	public static boolean landSearch(int orders) throws Exception {
		int position = 0;
		int pay = 0;
		String sql = "select position from player where orders = " + orders;
		sta = conn.createStatement();

		ResultSet rs = sta.executeQuery(sql);
		if (rs.next()) {
			position = rs.getInt("position");// 得到玩家位置
		}
		String sql2 = "select pay from land where position = " + position;
		rs = sta.executeQuery(sql2);

		if (rs.next()) {
			pay = rs.getInt("pay");
		}
		if (pay != 0) {
			return true;
		}
		return false;
	}
	public boolean landSearchServer(int position) throws Exception {
		
		int pay = 0;

		ResultSet rs;

		String sql2 = "select pay from land where position = " + position;
		rs = sta.executeQuery(sql2);

		if (rs.next()) {
			pay = rs.getInt("pay");
		}
		if (pay != 0) {
			return true;
		}
		return false;
	}

	// 随机事件 三顾茅庐 增加自身兵力400点
	public static void threeVisitsToTheHut(int id) {// 测试成功
		int money = 0;
		String sql1 = "select money from player where orders = " + id;

		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql1);
			while (rs.next()) {
				money = rs.getInt("money") + 400;
			}
			String sql2 = "update player set money = " + money
					+ " where orders = " + id;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 随机事件 桃园结义选择一座城池免费升一级
	public static void friendshipInPeachGarden(int position) {// 测试成功

		try {
			int level = 0;
			String sql1 = "select level from land where position = " + position;
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql1);
			if (rs.next()) {
				level = rs.getInt("level") + 1;
			}
			String sql2 = "update land set level = " + level
					+ " where position = " + position;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 随机事件 驱狼逐虎 其他玩家丢失500兵力
	public static void driveTheWolf(int id) {// 测试失败
		int money = 0;
		int otherId = 0;
		String sql1 = "SELECT money,id FROM player WHERE id NOT IN(" + id + ")";
		int[] arr1 = new int[20];
		int[] arr2 = new int[20];
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql1);
			int i = 0;
			while (rs.next()) {
				i++;
				money = rs.getInt("money") - 500;
				otherId = rs.getInt("id");
				arr1[i] = money;
				arr2[i] = otherId;
				//System.out.println(money + "---" + otherId);
				
			}

			int j = 0;
			for (j = 0; i <=arr1.length; j++)
			{
				if(arr1[i]!=0)
				System.out.println(arr1[j] + "--" + arr2[j]);
			}

			// sta = conn.createStatement();
			// String sql2 = "update player set money = " + money +
			// "where id = "
			// + otherId;
			// int count = sta.executeUpdate(sql2);
			// if (count != 0) {
			// System.out.println("上传成功");
			// } else {
			// System.out.println("失败");
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 随机事件 青梅煮酒增加自身500点兵力
	public static void cookWine(int id) {// 测试成功
		int money = 0;
		String sql1 = "select money from player where orders = " + id;

		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql1);
			while (rs.next()) {
				money = rs.getInt("money") + 500;
			}
			String sql2 = "update player set money = " + money
					+ " where orders = " + id;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql2);
			if (count != 0) {
				//System.out.println("上传成功");
			} else {
				//System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 随机事件千里单骑 前进几格
	public static int thousandsOfPerformers() {// 测试成功
		Random r = new Random();
		int R = r.nextInt(6) + 1;
		return R;
	}

	// 随机事件水淹下邳 停留一回合
	public static void flooding(int id) {// 测试成功
		String sql = "update player set stop = 1 where id = " + id;
		try {
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int[] getMyLand(int id) {
		int[] arr = new int[20];
		String sql = "select position from land where owner = " + id;
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				int i = 0;
				arr[i] = rs.getInt("position");
				i = i + 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	public static void saveGame(int number) throws SQLException{
		String sql1 = "delete from roundsave"+number+" where 1=1";
		String sql2 = "insert into roundsave"+number+" select * from round";
		
		String sql3 = "delete from playersave"+number+" where 1=1";
		String sql4 = "insert into playersave"+number+" select * from player";
		
		String sql5 = "delete from landsave"+number+" where 1=1";
		String sql6 = "insert into landsave"+number+" select * from land";
		PreparedStatement ptmt = conn.prepareStatement(sql1);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql2);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql3);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql4);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql5);
		ptmt.execute();
		ptmt = conn.prepareStatement(sql6);
		ptmt.execute();
		
	}
	
	public static void setTime(int time,int id){
		String sql = "insert into time (liveTime,userId) values("+time+","+id+")";
		try {
			sta = conn.createStatement();
			count = sta.executeUpdate(sql);
			if (count != 0) {
				System.out.println("时间上传成功！");
			} else {
				System.out.println("时间上传失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Integer>  getTime(){
		String sql = "SELECT liveTime FROM time ORDER BY liveTime DESC";
		ArrayList<Integer> sitetime = new ArrayList<Integer>();
		
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				sitetime.add(rs.getInt("liveTime"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sitetime;
		
	}
	
	public static ArrayList<Integer> getUserId() {
		String sql = "SELECT userId FROM time ORDER BY liveTime DESC";
		
	
		ArrayList<Integer> siteuserid = new ArrayList<Integer>();
		try {
			
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				siteuserid.add(rs.getInt("userId"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return siteuserid;

	}
	

	public static void floodingServer(int role) {// 测试成功
		String sql = "update player set stop = 1 where role = " + role;
		try {
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void main(String[] args) {
		//Sql.connection();
		// int[] a = new int[20];
		// a = new GameFunction().getMyLand(2);
		// for(int i=0;i<20;i++){
		// System.out.println(a[i]);
		// }
		
		
		
	}
	

}
