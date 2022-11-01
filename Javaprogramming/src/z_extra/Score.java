package z_extra;

public class Score {
	//alt+shift+s : 생성자랑 메서드 만들 때
	//alt+shift+a : 카사기 바뀌어서 한번에 여러줄을 칠 수 있다
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int soc;
	private int sci;
	private int oracle;
	private int java;
	private int rank = 1;
	
	//alt+shift+s+suing field
	public Score(String name, int kor, int eng, int math, int soc, int sci, int oracle, int java) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.soc = soc;
		this.sci = sci;
		this.oracle = oracle;
		this.java = java;
	}

	//alt+shift+s+getters&setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}
	public int getSum() {
		return kor + eng + math + soc + sci + oracle + java;
	}
	public double getAverage() {
		return getSum() / 7.0;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	//setr -> set rank
	//getr -> get rank
	

	//alt+shift+s+toString
	@Override
	public String toString() {
		//데이터를 뭐 넣었는지 확인할 때 사용
		//여기 데이터를 기져다 쓰는 클래스에서 score를 인쇄하면 변수별 입력된 값들이 나온다. 안할 시에는 그냥 주소값만 나옴
		return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\t"
							, name, kor, eng, math, soc, sci, oracle, java, getSum(), getAverage(), getRank());
	}
	
	
	
	
	
	
	
}
