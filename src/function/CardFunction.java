package function;

import java.sql.ResultSet;
import java.sql.SQLException;

import run.Sql;
import run.SystemRun;

public class CardFunction extends Sql {

	public static void prison(int orders) throws Exception {
		/*
		 * �������ҵĳ���˳�� ʹָ������ƶ�������
		 */
		if (conn == null) {
			System.out.println("conn is null");
		}
		String sql = "update player set stop=2 where orders=" + orders;
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
	}

	public void doubleRent(int position) throws Exception {
		/*
		 * ʹָ����صķ�����2��
		 */
		String sql = "select pay from land where position = " + position;
		sta = conn.createStatement();
		ResultSet rs1 = sta.executeQuery(sql);
		int pay = rs1.getInt("pay")*2;
		String sql2 = "update player set money = " + pay + " where position = "
		+ position;
		sta.executeUpdate(sql2);
		
	}

	public void notDied(int orders) {
		/*
		 * ����������֧������󣬲��������Ʋ������ǽ�������Ϊ1000������˳���1
		 */
		String sql="update player set money=1000 where orders=" + orders;
	}

	public int controlDice(int number) {
		/*
		 * �����ӱ���Լ���Ҫ�ĵ���
		 */
		return number;
	}
}
