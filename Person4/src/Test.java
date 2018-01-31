
public class Test {

	public static void main(String[] args) {


//		Person4 taro = new Person4();
//		taro.name= "山田太郎";
//		taro.age=20;
//
//		//演習
//		Person4 nao = new Person4();
//		nao.name = "直樹";
//		nao.age = 23;
//		nao.phoneNumber = "090-2564-3696";
//		nao.address = "ntex17.th@icloud.com";
//
//
//		System.out.println(taro.name);
//		System.out.println(taro.age);
//		taro.talk();
//		taro.walk();
//		taro.run();
//
//
//		//演習
//		System.out.println(nao.name);
//		System.out.println(nao.age);
//		System.out.println(nao.phoneNumber);
//		System.out.println(nao.address);
//		nao.talk();
//		nao.walk();
//		nao.run();


		Person4 taro = new Person4();
		taro.name = "taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person4 jiro = new Person4("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);





		Person4 saburo = new Person4();
		saburo.name = "saburo";
		saburo.age = 0;
		System.out.println(saburo.name);
		System.out.println(saburo.age);



		Person4 tarou = new Person4();
		tarou.name = "名前なし";
		tarou.age = 25;
		System.out.println(tarou.name);
		System.out.println(tarou.age);


		Person4 hanako = new Person4();
		hanako.name = "hanako";
		hanako.age = 17;
		System.out.println(hanako.name);
		System.out.println(hanako.age);




	}

}
