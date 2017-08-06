/*------------------------------------------------------------------------*
 * Copyright (c) 2016 Softbank C&S MD Div, System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	SampleCircle
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.8.30 (Tue.)
 * Update Written: 	____.__.__
 *-------------------------------------------------------------------------*/
/import java.awt.Point;
//import java.lang.Math;
import java.util.ArrayList;

/*
 * for test share the project to gitHub at 14:32 2017/4/18
 * second test for push this file to gitHub at 14:34 2017/4/18
 */

//Shape Interface
interface Shape {
    //面積を計算する
    public abstract double getArea();
    //定数の定義
    public static final double PAI = 3.1416;
}

//Circle Class
class Circle implements Shape {
    //field
    public Point XY; //中心座標
    public int radius; //円の半径

    //コンストラクタ
    Circle() {
        XY = new Point();
        radius = 0;
    }
    Circle(int x, int y, int r){
        XY = new Point(x, y);
        radius = r;
    }
    /*Method Define
      インタフェース内で定義されたメソッド(getArea)は暗黙的にpublic、abstract修飾子が付与されています。
      そのため、クラス内でメソッドの定義を行う場合は明示的にpublic修飾子を付与する必要があります。*/
    public double getArea() {
        return radius * radius * PAI;
    }
}

//楕円のクラス
class Ellipse implements Shape {
    //field
    public Point XY; //中心座標
    public int radiusl; //楕円の長半径
    public int radiuss; //楕円の短半径

    //Construct
    Ellipse() {
        XY = new Point();
        radiusl = radiuss = 0;
    }
    Ellipse(int x, int y, int rl, int rs) {
        XY = new Point(x, y);
        radiusl = rl;
        radiuss = rs;
    }
    /*Method Define
    インタフェース内で定義されたメソッド(getArea)は暗黙的にpublic、abstract修飾子が付与されています。
    そのため、クラス内でメソッドの定義を行う場合は明示的にpublic修飾子を付与する必要があります。*/    
    public double getArea() {
        return radiusl * radiuss * PAI;
    }
}

public class SampleCircle {

	public static void main(String[] args) {
		
		//配列 length 
		int[] intArray = new int[10];
		
        //Circle Object Create
        Circle cir = new Circle(100, 200, 20);
        //Ellipse Object Create
        Ellipse ell = new Ellipse(100, 100, 20, 30);

        //それぞれの面積を計算する
        System.out.println("円の面積：" + cir.getArea());
        System.out.println("楕円の面積：" + ell.getArea());

        //配列リストにCircleオブジェクトとEllipseオブジェクトを保存する
        ArrayList al = new ArrayList();
        al.add(cir);
        al.add(ell);
        System.out.println("配列リストの各オブジェクトの面積");
        for (int i = 0; i<al.size(); i++) {
            System.out.println("面積 = " + ((Shape)(al.get(i))).getArea());
        }
        //配列テスト
        for(int i =0; i < intArray.length; i++){
        	intArray[i] = i * 10;
        	System.out.println(intArray[i]);
        }
	}
}
