
public class Person4 {

	public String name = null;
	public int age = 0;

//	public String phoneNumber = null;
//	public String address = null;
//
//
//
//
//	public void talk(){
//		System.out.println(this.name + "が話す");
//	}
//
//	public void walk(){
//		System.out.println(this.name + "が歩く");
//
//	}
//
//	public void run(){
//		System.out.println(this.name + "が走る");
//
//	}


//コンストラクタ１
	public Person4(){}



//コンストラクタ２
	public Person4(String name,int age){
			this.name = name;
			this.age = age;
		}

//コンストラクタ３
	public Person4(String name){
		this.name = name;
		this.age = 0;
	}

//コンストラクタ４
	public Person4(int age){
		this.name = "名前なし";
		this.age = age;
	}


//コンストラクタ５
	public Person4(int age, String name){
		this.name = name;
		this.age = age;

	}


	}








