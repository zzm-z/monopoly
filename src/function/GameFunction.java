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
		 * ʵ������ó�1-6ĳ���� ���øú����Ϳɻ��ҡɫ�ӵ�ֵ
		 */
		Random r = new Random();
		int R = r.nextInt(6) + 1;
		return R;
	}

	public void effectReduce() {
		/*
		 * ÿ������ļ���Ч��������Ч����ս������Ч�������Ч��ÿ�غϼ�һ
		 */
	}

	public static void prison(int orders) {
		/*
		 * ʹ����ͣ����ԭ��ʹ��ǰ������stop����+2
		 */
		try {
			String sql = "update player set stop = 2 where orders = " + orders;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
			if (count != 0) {
				//System.out.println("�ɹ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void prisonServer(int role) {
		/*
		 * ʹ����ͣ����ԭ��ʹ��ǰ������stop����+2
		 */
		try {
			String sql = "update player set stop = 2 where role = " + role;
			sta = conn.createStatement();
			int count = sta.executeUpdate(sql);
			if (count != 0) {
				//System.out.println("�ɹ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landUp(int money, int landGrades, int orders,
			int position) {
		/*
		 * �жϵ�ǰ��ҵ�Ǯ�Ƿ��㹻�����㹻������ʾ�������������ĵ������������������Ϳ۳���ǰ��������������������ǰ��صȼ�+1
		 */

		landGrades++;

		try {

			String sql2 = "update land set level = " + landGrades
					+ " where position = " + position;
			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();//
			ResultSet rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// �õ���Ǯ�����ҿ�1000��������
			}
			String sql1 = "update player set money = " + money
					+ " where orders = " + orders;
			int count1 = sta.executeUpdate(sql1);
			int count2 = sta.executeUpdate(sql2);
			if (count1 != 0 && count2 != 0) {
				//System.out.println("�ϴ��ɹ�");
			} else {
				//System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void landUpServer(int money, int landGrades, int orders,
			int position) {
		/*
		 * �жϵ�ǰ��ҵ�Ǯ�Ƿ��㹻�����㹻������ʾ�������������ĵ������������������Ϳ۳���ǰ��������������������ǰ��صȼ�+1
		 */

		landGrades++;

		try {

			String sql2 = "update land set level = " + landGrades
					+ " where position = " + position;
			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();//
			ResultSet rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// �õ���Ǯ�����ҿ�1000��������
			}
			String sql1 = "update player set money = " + money
					+ " where orders = " + orders;
			int count1 = sta.executeUpdate(sql1);
			int count2 = sta.executeUpdate(sql2);
			if (count1 != 0 && count2 != 0) {
				//System.out.println("�ϴ��ɹ�");
			} else {
				//System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landBuy(int orders) {
		/*
		 * �жϵ�ǰ�Ƿ񹻱������򣬲����͵���������������ĵ��������Ϳ۳�����������������ҽ���ǰ�������Ȩ��Ϊ��ǰ���
		 */
		int position = 0;
		int money = 0;
		try {
			String sql = "select position from player where orders = " + orders;

			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			if (rs.next()) {
				position = rs.getInt("position");// �õ����ﵱǰλ��
			}
			String sql2 = "update land set owner = " + orders
					+ " where position = " + position;
			String sql4 = "update land set level = 1 where position = " + position;
			rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// �õ���Ǯ
				//System.out.println(money);
			}
			String sqlmoney = "update player set money = " + money
					+ " where orders = " + orders;

			int count1 = sta.executeUpdate(sqlmoney);
			int count2 = sta.executeUpdate(sql2);
			int count3 = sta.executeUpdate(sql4);
			if (/* count1 != 0 && */count2 != 0) {
				//System.out.println("�ϴ��ɹ�");
			} else {
				//System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public  void landBuyServer(int orders) {
		/*
		 * �жϵ�ǰ�Ƿ񹻱������򣬲����͵���������������ĵ��������Ϳ۳�����������������ҽ���ǰ�������Ȩ��Ϊ��ǰ���
		 */
		int position = 0;
		int money = 0;
		try {
			String sql = "select position from player where orders = " + orders;

			String sql3 = "select money from player where orders = " + orders;
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			if (rs.next()) {
				position = rs.getInt("position");// �õ����ﵱǰλ��
			}
			String sql2 = "update land set owner = " + orders
					+ " where position = " + position;
			String sql4 = "update land set level = 1 where position = " + position;
			rs = sta.executeQuery(sql3);
			if (rs.next()) {
				money = rs.getInt("money") - 1000;// �õ���Ǯ
				//System.out.println(money);
			}
			String sqlmoney = "update player set money = " + money
					+ " where orders = " + orders;

			int count1 = sta.executeUpdate(sqlmoney);
			int count2 = sta.executeUpdate(sql2);
			int count3 = sta.executeUpdate(sql4);
			if (/* count1 != 0 && */count2 != 0) {
				//System.out.println("�ϴ��ɹ�");
			} else {
				//System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void landFine(int orders, int position) {
		  /*
		   * �벻���ڵ�ǰ������˵���ҷ���ս��������ū��һ���ֱ������۳���ǰ����跣����Ӧ����
		   */
		  int money = 0;

		  try {
		   int owner = 0;
		   int level = 0;
		   money = 0;
		   // ��������position��ѯ���صȼ��Ա�������ڿ�Ǯ����Ǯ
		   String sql3 = "select owner,level from land where position = "
		     + position;
		   String sql4 = "select money from player where orders = " + orders;
		   sta = conn.createStatement();
		   ResultSet rs = sta.executeQuery(sql3);

		   if (rs.next()) {
		    owner = rs.getInt("owner");// �õ�������
		    level = rs.getInt("level");// �õ��ȼ�
		   }
		   rs = sta.executeQuery(sql4);
		   if (rs.next()) {
		    money = rs.getInt("money");// �õ���Ǯ
		   }
		   if (level == 1) {
		    money = money - 1000;
		   } else if (level == 2) {
		    money = money - 2000;
		   } else {
		    money = money - 3000;
		   }
		   String sql1 = "update player set money = " + money
		     + " where orders = " + orders;// ��ȥ��·�ߵ�Ǯ
		   sta = conn.createStatement();
		   int count1 = sta.executeUpdate(sql1);
		   if (count1 != 0) {
		    //System.out.println("�ɹ�1");
		    String sql2 = "select money,YorNout from player where orders = "
		      + owner;// ��ѯ��Ƥӵ�������ж���Ǯ�Ա��������
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
		        + " where orders = " + owner+"AND YorNout NOT IN(0)";// ��Ƥӵ������Ǯ
		      sta = conn.createStatement();
		      int count2 = sta.executeUpdate(sql0);
		      if (count2 != 0) {
		       System.out.println("�ɹ�2");
		      }
		     }else{
		      System.out.println("���ø�ʧ�ܵ����֧����");
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
		 * ��ս�������ڵ�ͼ��ĳ�������������
		 */
	}

	public static boolean landSearch(int orders) throws Exception {
		int position = 0;
		int pay = 0;
		String sql = "select position from player where orders = " + orders;
		sta = conn.createStatement();

		ResultSet rs = sta.executeQuery(sql);
		if (rs.next()) {
			position = rs.getInt("position");// �õ����λ��
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

	// ����¼� ����é® �����������400��
	public static void threeVisitsToTheHut(int id) {// ���Գɹ�
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

	// ����¼� ��԰����ѡ��һ���ǳ������һ��
	public static void friendshipInPeachGarden(int position) {// ���Գɹ�

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

	// ����¼� ������ ������Ҷ�ʧ500����
	public static void driveTheWolf(int id) {// ����ʧ��
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
			// System.out.println("�ϴ��ɹ�");
			// } else {
			// System.out.println("ʧ��");
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ����¼� ��÷�����������500�����
	public static void cookWine(int id) {// ���Գɹ�
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
				//System.out.println("�ϴ��ɹ�");
			} else {
				//System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ����¼�ǧ�ﵥ�� ǰ������
	public static int thousandsOfPerformers() {// ���Գɹ�
		Random r = new Random();
		int R = r.nextInt(6) + 1;
		return R;
	}

	// ����¼�ˮ������ ͣ��һ�غ�
	public static void flooding(int id) {// ���Գɹ�
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
				System.out.println("ʱ���ϴ��ɹ���");
			} else {
				System.out.println("ʱ���ϴ�ʧ�ܣ�");
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
	

	public static void floodingServer(int role) {// ���Գɹ�
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
