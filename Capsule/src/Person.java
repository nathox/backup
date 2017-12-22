
public class Person {


		private String name = null;
		private int age = 0;

		public Person(String name, int age){

			setName(name);
			this.age = age;
		}




	//カプセル化部分
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}






	}

//}
