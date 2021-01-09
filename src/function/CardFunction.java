package function;

import java.sql.ResultSet;
import java.sql.SQLException;

import run.Sql;
import run.SystemRun;

public class CardFunction extends Sql {

	public static void prison(int orders) throws Exception {
		/*
		 * 传入该玩家的出牌顺序 使指定玩家移动到监狱
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
		 * 使指定领地的罚金变成2倍
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
		 * 当兵力不够支付罚款后，不会立即破产，而是将兵力改为1000，并且顺序加1
		 */
		String sql="update player set money=1000 where orders=" + orders;
	}

	public int controlDice(int number) {
		/*
		 * 将骰子变成自己想要的点数
		 */
		return number;
	}
}
