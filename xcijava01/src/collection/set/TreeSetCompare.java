package collection.set;


import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
    int data1;
    int data2;

    public MyClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
}

class MyComparableClass implements Comparable<MyComparableClass> {
    int data1;
    int data2;

    public MyComparableClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public int compareTo(MyComparableClass o) {
        if (this.data1 < o.data1) {
            return -1;
        } else if (this.data1 == o.data1) {
            return 0;
        } else {
            return 1;
        }
    }
}


public class TreeSetCompare {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        Integer intValue1 = 10;
        Integer intValue2 = 20;
        treeSet1.add(intValue2);
        treeSet1.add(intValue1);
        System.out.println("treeSet1 = " + treeSet1);
        
        
        
        //-----------------------------------
        TreeSet<MyComparableClass> treeSet4 = new TreeSet<>();
        MyComparableClass myComparableClass1 = new MyComparableClass(2, 5);
        MyComparableClass myComparableClass2 = new MyComparableClass(3, 3);
        treeSet4.add(myComparableClass1);
        treeSet4.add(myComparableClass2);
        for (MyComparableClass mcc : treeSet4) {
            System.out.println("mcc.data1 = " + mcc.data1);
        }
        //-------------------------------------

//        TreeSet<MyClass> treeSet3 = new TreeSet<>();
//        MyClass mc1 = new MyClass(2, 5);
//        MyClass mc2 = new MyClass(3, 3);
//        treeSet3.add(mc1);
//        treeSet3.add(mc2);
//        System.out.println("treeSet3 = " + treeSet3);
        //--------------------------------------
        TreeSet<MyClass> treeSet5 = new TreeSet<>(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                if (o1.data1 < o2.data1) {
                    return -1;
                } else if (o1.data1 == o2.data1) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        MyClass mc3 = new MyClass(2, 5);
        MyClass mc4 = new MyClass(3, 3);
        treeSet5.add(mc3);
        treeSet5.add(mc4);
        for (MyClass mc : treeSet5) {
            System.out.println("mc.data1 = " + mc.data1);
        }
        
    }
}
