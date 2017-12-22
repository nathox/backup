
public class Person {

	private String name = null;
	private int age = 0;

	//コピーの窓口
	public Person(String name, int age){

		this.name = name;
		this.age = age;

//		setName(name);
//		this.age = age;

}



//変数「name」のgetter/setter
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

//変数「age」のgetter/setter
	public int getAge(){
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	}
