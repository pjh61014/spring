package exam;

public class Account {
	private String accId;
	private long balance=1000000;
	
	public Account(){
		System.out.println("accout����");
	}
	public void setAccId(String accId){
		this.accId = accId;
	}
	public String getAccId(){
		return this.accId;
	}
	//�Ա��ϱ�
	public void input(long money){
		balance = balance+money;
	}
	//����ϱ�
	public void output(long money){
		balance = balance-money;
	}
	//�ܾ���ȸ�ϱ�
	public long getBalance(){
		return balance;
	}
}
