
public class Person3 {

	public String name = null;
	public int age = 0;


	//コンストラクタ１
	public Person3(){}


	//コンストラクタ２
	public Person3(String name,int age){
		this.name = name;
		this.age = age;
	}

	//コンストラクタ３
	public Person3(String name){
		this.name = name;
		this.age=0;
	}

	//コンストラクタ４
	public Person3(int age){
		this.name = "名前なし";
		this.age = age;
	}


	//コンストラクタ５
	public Person3(int age,String name){
		this.name = name;
		this.age = age;
	}


}




