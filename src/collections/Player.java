package collections;

import java.util.Comparator;

public class Player {

	int jerseyNo;
	String name;
	int age;
	int score;
	
	public Player(int jerseyNo, String name, int age, int score) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}


class ScoreComparator implements Comparator<Player>{
	
	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getScore(), p2.getScore());
	}
}



