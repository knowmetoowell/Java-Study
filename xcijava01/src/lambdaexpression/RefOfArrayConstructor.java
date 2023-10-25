package lambdaexpression;


interface A_a {
    int[] abc(int len);
}
public class RefOfArrayConstructor {
    A_a a1 = len -> new int[len];
    A_a a2 = int[]::new;
}
