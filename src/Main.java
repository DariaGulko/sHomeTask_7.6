/**
 * Created by Dariya on 22.10.2015.
 * �������� �� ����� ������ 11 ������ ������������������ ���������.
 * ����������, ��� ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.
 */
public class Main {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i<100 ; i=i+a) {
            a+=i;
            System.out.print(i+" ");
            System.out.print(a+" ");
        }
    }

}
