/**
 * Created by Мишка on 11.07.16.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14169f;

    public void NarrowRunner(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
