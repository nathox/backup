
public class HelloWorld {

	public static void main(String[] args) {
		//2時間目
		// Hello World!の出力
		System.out.println("Hello World!");

		//3時間目
		System.out.println("こんにちは！");
		System.out.println("123");
		System.out.println("おはよう");
		System.out.println("例外が");
		System.out.println("発生\r\nしました");

		//4時間目
		String name = "高橋";
		System.out.println(name);

		String str1 = "鈴木";
		System.out.println(str1);

		String str2 = "Tanaka";
		System.out.println(str2);

		String tel = "090-1234-5678";
		System.out.println(tel);

		char char1 = 'A';
		System.out.println(char1);

		int num1 = 12345;
		System.out.println(num1);

		boolean boo = true;
		System.out.println(boo);

		int a = 3+3;
		System.out.println(a);

		//String a = "3+3";
		//System.out.println(a);

		//char a = 'A';
		//System.out.println(a);

		String abc = "山田";
		System.out.println(abc + "さん");

		//5時間目

		float a1 = (float)10 / 3;

		System.out.println(a1);



		//6時間目

		//加算子（インクリメント）
		//前置加算子

		int d = 10;

		System.out.println(++d);

		//↑↑重複ローカル変数によりdで表記



		int e = 10;

		System.out.println( ++e);
		System.out.println("\n");
		System.out.println( ++e);
		System.out.println("\n");
		System.out.println( ++e);
		System.out.println("\n");
		System.out.println( ++e);


		//後置加算子

		int f = 10;

		System.out.println(f++);


		int g = 10;

		System.out.println( ++g);
		System.out.println("\n");
		System.out.println( ++g);
		System.out.println("\n");
		System.out.println( ++g);
		System.out.println("\n");
		System.out.println( ++g);



		//減算子（デクリメント）

		int h = 10;

		System.out.println(--h);


		int i = 10;

		System.out.println(--i);
		System.out.println("\n");
		System.out.println( ++i);
		System.out.println("\n");
		System.out.println( ++i);
		System.out.println("\n");
		System.out.println( ++i);


		//後置減算子

		int j = 10;

		System.out.println( j-- );


		int k = 10;

		System.out.println(k--);
		System.out.println("\n");
		System.out.println( k--);
		System.out.println("\n");
		System.out.println( k--);
		System.out.println("\n");
		System.out.println( k--);


		//7時間目

		//比較演算子

		int l = 10;

		if(l < 20){
			System.out.println("A");



		int m = 20;

		if(m <= 30){
			System.out.println("B");
		}


		String n = "山田";

		if(n.equals("山田")){
			System.out.println(n+"さん");
		}




		//論理演算子 && || !

		int o = 5;

		if(0<10 && 3<o){
			System.out.println("A");
		}


		int p = 5;

		if(p>=5 || p<=0){
			System.out.println("B");
		}


		//elseif文

		int q = 7;

		if(q > 8){
			System.out.println("A");
		}else if(q <10){
			System.out.println("B");
		}





		//else文の例文



		int r = 3;

		if(r > 5){
			System.out.println("A");

		}else{
			System.out.println("z");
		}



		int s = 20;

		if(s < 8){
			System.out.println("A");
		}else if(a == 8){
			System.out.println("B");
		}else{
			System.out.println("C");
		}





		int t = 18;

		if(t >= 20){
			System.out.println("成人");
		}else{
			System.out.println("未成年");
		}




		int age = 35;

		if(age < 20){
			System.out.println("未成年");
		}else if(age > 80){
			System.out.println("高齢者");
		}else{
			System.out.println("成人");
		}


		int age1 = 35;

		if(age1 < 20){
			System.out.println("未成年");
		}else if(age1 >= 20 && age1 <= 80){
			System.out.println("成人");
		}else{
			System.out.println("高齢者");
		}


		int u =5;

		if(u % 2 ==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}


		//8時間目


		int v = 20;

		if(v > 10){
			if(v < 30){
				System.out.println("A");
			}
		}


		int w = 7;

		if(w > 3){
			if(w < 10){
				System.out.println("A");
			}
		}


		int x = 50;

		if(x > 10){
			if(x < 30){
				System.out.println("A");
			}
		}



		//if + else(elseif) + ネストの組み合わせ


		int y = 10;

		if(y > 0)
			if(y == 2){
				System.out.println("A");
			}else if(y == 3){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
		}


		int number = 88;

		if(number <= 100){
			if(number < 20){
				System.out.println("未成年");
			}else if(number == 77){
				System.out.println("喜寿");
			}else if(number == 88){
				System.out.println("米寿");
			}else{
				System.out.println("成人");
			}
		}



		int number1 = 36;

		if(number1 <= 100){
			if(number1 < 20){
				System.out.println("未成年");
			}else if(number1 == 77){
				System.out.println("喜寿");
			}else if(number1 == 88){
				System.out.println("米寿");
			}else{
				System.out.println("成人");
			}
		}



		int number2 = 110;

		if(number2 <= 100){
			if(number2 < 20){
				System.out.println("未成年");
			}else if(number2 == 77){
				System.out.println("喜寿");
			}else if(number2 == 88){
				System.out.println("成人");
			}
		}




		//9時間目

		int z = 1;

		switch(z){
		case 0:
			System.out.println("aは0に等しい");
			break;

		case 1:
			System.out.println("aは1に等しい");
			break;
		}





		int aa = 5;

		switch(aa){
		case 0:
			System.out.println("aは0に等しい");
			break;
		case 1:
			System.out.println("aは1に等しい");
			break;
			default:

			System.out.println("aは0でも1でもない");
		}



		String bb = "赤";

		switch(bb){
		case"赤":
			System.out.println("赤組です");
			break;

		case"白":
			System.out.println("白組です");
			break;
		}



		String cc = "青";

		switch(cc){
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		default:
			System.out.println("エラーです");
		}




		//10時間目


		String[] name1 = new String[3];

		name1[0]="田中";
		name1[1]="高橋";
		name1[2]="斉藤";

		System.out.println(name1[0]);



		String[] name2 = {"田中","高橋","斉藤"};

		System.out.println(name2[0]);



		char[] c = {'x','y','z'};

		System.out.println(c[0]);


		char[] c1 = {'x','y','z'};

		System.out.println(c1[1]);


		char[] c2 = {'x','y','z'};

		System.out.println(c2[2]);




		int[] dd = {1,5,10};

		System.out.println(dd[0]);



		int[] ee = {1,5,10};

		System.out.println(ee[1]);



		String[] name3 = {"田中","高橋","斉藤"};

		name3[0]="加藤";

		System.out.println(name3[0]);





		//11時間目



		String[][] country =
			{
					{"日本","タイ"},
					{"アメリカ","ブラジル"},
					{"フランス","ロシア"}
			};

		System.out.println(country[0][0]);





		String[][] country1 =
			{
					{"日本","タイ"},
					{"アメリカ","ブラジル"},
					{"フランス","ロシア"}
			};

		System.out.println(country1[0][1]);




		String[][] country2 =
			{
					{"日本","タイ"},
					{"アメリカ","ブラジル"},
					{"フランス","ロシア"}
			};

		System.out.println(country2[1][0]);




		String[][] country3 =
			{
					{"日本","タイ"},
					{"アメリカ","ブラジル"},
					{"フランス","ロシア"}
			};

		System.out.println(country3[2][1]);





		String[][] country4 = new String[3][2];

		country4[0][0] = "日本";
		country4[0][1] = "タイ";
		country4[1][0] = "アメリカ";
		country4[1][1] = "ブラジル";
		country4[2][0] = "フランス";
		country4[2][1] = "ロシア";

		System.out.println(country4[0][0]);



		String[][] country5 = new String[3][2];

		country5[0][0] = "日本";
		country5[0][1] = "タイ";
		country5[1][0] = "アメリカ";
		country5[1][1] = "ブラジル";
		country5[2][0] = "フランス";
		country5[2][1] = "ロシア";

		System.out.println(country5[1][1]);



		//12時間目


		for(int ff = 0; ff<3; ff++){
			System.out.println(ff);
		}


		for(int gg = 0; gg<10; gg++){
			System.out.println(gg);
		}


		for(int hh = 3; hh<10; hh++){
			System.out.println(hh);
		}



		for(int ii = 3; ii<=10; ii++){
			System.out.println(ii);
		}


		for(int jj = 10; jj>5 ; jj--){
			System.out.println(jj);
		}

		for(int kk = 10; kk >= 5 ; kk--){
			System.out.println(kk);
		}

		for(int ll = 1; ll < 10 ; ll+=2){
			System.out.println(ll);
		}


		for(int mm = 1; mm < 10 ; mm+=3){
			System.out.println(mm);
		}

		for(int nn = 10; nn > 1 ; nn-=2){
			System.out.println(nn);
		}

		for(int oo = 10; oo > 1 ; oo-=3){
			System.out.println(oo);
		}

		for(int pp = 1; pp <= 5 ; pp++){
			System.out.println("★");
		}




		//13時間目



		for(int qq = 1 ; qq <= 10; qq++)
				if(qq % 2 == 0){
					System.out.println(qq + "\n");
				}


		for(int rr = 0 ; rr < 3; rr++)
			for(int ss = 1; ss < 4; ss++){
				System.out.println(ss);

				System.out.println("\n");
	}



		int tt = 10;

		String uu = a >= 0 ? "プラス":"マイナス";

		System.out.println(uu);


		int vv = 2;

		String ww = a % 2 == 0 ? "偶数":"奇数";

		System.out.println(ww);





		for(int xx=0; xx<=5; xx++){

			String yy = xx % 2 == 0 ? "☆":"★";

			System.out.println(yy);
		}



		//14時間目

		int zz = 1;

		while(zz <= 5){

			System.out.println(zz);

			zz++;
		}



		int aaa = 0;

		while(aaa < 10){

			System.out.println(aaa);

			aaa++;

		}




		int bbb = 5;

		while(bbb < 10){

			System.out.println(bbb);

			bbb++;

		}



		int ccc = 5;

		while(ccc > 0){

			System.out.println(ccc);

			ccc--;

		}



		int ddd = 10;

		while(ddd >=5){

			System.out.println(ddd);

			ddd--;
		}





		int eee = 1;

		while(eee <= 10){

			System.out.println(eee);

			eee+=2;
		}


		int fff = 1;

		while(fff <= 10){

			System.out.println(fff);

			fff+=3;

		}


		int ggg = 10;

		while(ggg >= 1){

			System.out.println(ggg);

			ggg-=2;

		}


		int hhh = 10;

		while(hhh >= 1){

			System.out.println(hhh);

			hhh-=3;

		}




		int iii = 1;

		while(iii <= 5){

			System.out.println("★");

			iii++;

		}



		//15時間目


		int jjj = 1;

		do{

			System.out.println(jjj);

			jjj--;

		} while(jjj > 1);




		int kkk = 0;

		do{

			System.out.println(kkk);

			kkk++;

		} while(kkk < 10);





		int lll = 5;

		do{

			System.out.println(lll);

			lll++;

		} while(lll < 10);





		int mmm = 5;

		do{

			System.out.println(mmm);

			mmm--;

		} while(mmm > 0);





		int nnn = 1;

		do{

			System.out.println(nnn);

			nnn += 2;

		} while(nnn <= 10);





		int ooo = 10;

		do{

			System.out.println(ooo);

			ooo-=3;

		} while(ooo >= 1);




		//オブジェクト指向




























		}






	}

