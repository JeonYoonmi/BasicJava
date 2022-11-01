package f_game.assignment_final;

public class PC {
	String info;
	String[] sv = new String[100];
	String[] pc = new String[100];
	int j;
	
	public void showPoketmonInfo(Poketmon m) {
		System.out.println("==================================================================");
		System.out.println("---------------------------방금 잡은 포켓몬-----------------------------");
		System.out.println("==================================================================");

		this.info = "이름: " + m.name + "\n";
		info += "설명: " + m.CharacterInfo + "\n";
		info += "속성: " + m.type + "\n";
		if(0 < m.hp) info += "체력: " + m.hp + "\n";
		if(0 < m.att) info += "공격력: " + m.att + "\n";
		if(0 < m.def) info += "방어력: " + m.def + "\n";
		info += "스킬 이름: " + m.skill + "\n";
		if(0 < m.att) info += "스킬 공격력: " + m.att;
		
		System.out.println(info);
		System.out.println("==================================================================");
		System.out.println();
	}

	String[] save(Poketmon m) {
		showPoketmonInfo(m);
		for(int i = 0 ; i < sv.length; i++) {
			if(sv[i] == null) {
				sv[i] = m.name;
				break;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < sv.length; i++) {
			boolean flag = true;
			for(j = 0; j < pc.length; j++) {
				if(sv[i] == null) {
					flag = false;
				}
			}
			if(flag) {
				pc[cnt++] = sv[i];
			}
		}
		
		String[] result = new String[cnt];
		for(int i = 0; i < result.length; i++) {
			result[i] = pc[i];
		}
		return result;
	}

}