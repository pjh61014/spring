package board.dto;

public class BoardDTO {
	private String boardno;
	private String memid;
	private String title;
	private String text;
	private int count;
	private String regdate;
	private String moddate;

	public BoardDTO() {

	}

	public BoardDTO(String memid, String title, String text) {
		super();
		this.memid = memid;
		this.title = title;
		this.text = text;
	}

	public BoardDTO(String boardno, String memid, String title, String text, int count, String regdate) {
		super();
		this.boardno = boardno;
		this.memid = memid;
		this.title = title;
		this.text = text;
		this.count = count;
		this.regdate = regdate;
	}

	public BoardDTO(String boardno, String memid, String title, String text, int count, String regdate,
			String moddate) {
		super();
		this.boardno = boardno;
		this.memid = memid;
		this.title = title;
		this.text = text;
		this.count = count;
		this.regdate = regdate;
		this.moddate = moddate;
	}

	public String getBoardno() {
		return boardno;
	}

	public void setBoardno(String boardno) {
		this.boardno = boardno;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardno=" + boardno + ", memid=" + memid + ", title=" + title + ", text=" + text + ", count="
				+ count + ", regdate=" + regdate + ", moddate=" + moddate + "]";
	}

}
