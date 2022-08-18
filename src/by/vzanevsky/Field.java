package by.vzanevsky;

// ���� ����������:
/* 1. �������������:
         - byte (-128..127) / 8 bit
         - short (�32768..32767) / 16 bit
         - int (?2147483648..2147483647) / 32 bit
         - long (-9223372036854775808..9223372036854775807) / 64 bit / �������� ������ L
2. � ��������� ������
         - double / 32 bit
         - float / 64 bit / �������� ������ F
3. ����������
         - char / 16 bit / ���� ������ / ����� � ��������� �������
4. ����������
         - boolean / ��������� �������� true ���� false
 */

public class Field {

    public static final int int1 = 666;

    public static void main(String[] args) {

        byte byte1 = -125;
        System.out.println("���������� byte1 = " + byte1);
        byte byte2 = 14;
        System.out.println("���������� byte2 = " + byte2);
        byte byte3 = 29;
        System.out.println("���������� byte3 = " + byte3);
        byte byte4 = 119;
        System.out.println("���������� byte4 = " + byte4);

        short short1 = -32767;
        System.out.println("���������� short1 = " + short1);
        short short2 = -3;
        System.out.println("���������� short2 = " + short2);
        short short3 = 5678;
        System.out.println("���������� short3 = " + short3);
        short short4 = 32767;
        System.out.println("���������� short4 = " + short4);

        int int1 = -2147483647;
        System.out.println("���������� int1 = " + int1);
        int int2 = -1564;
        System.out.println("���������� int1 = " + int2);
        int int3 = -2;
        System.out.println("���������� int1 = " + int3);
        int int4 = 2147483647;
        System.out.println("���������� int1 = " + int4);

        long long1 = -9223372036854775808L;
        System.out.println("���������� long1 = " + long1);
        long long2 = -23986582735L;
        System.out.println("���������� long2 = " + long2);
        long long3 = 8L;
        System.out.println("���������� long3 = " + long3);
        long long4 = 9223372036854775807L;
        System.out.println("���������� long4 = " + long4);

        double double1 = -2.5;
        System.out.println("���������� double1 = " + double1);
        double double2 = 176.87;
        System.out.println("���������� double1 = " + double2);
        double double3 = 1.349673846;
        System.out.println("���������� double1 = " + double3);
        double double4 = 46996.457693;
        System.out.println("���������� double1 = " + double4);

        float float1 = -26798.5F;
        System.out.println("���������� float1 = " + float1);
        float float2 = -3318870.557568679F;
        System.out.println("���������� float1 = " + float2);
        float float3 = 0.584358090325736576324F;
        System.out.println("���������� float1 = " + float3);
        float float4 = -0.83265872365905766745645767954645346688F;
        System.out.println("���������� float1 = " + float4);

        char char1 = 'A';
        System.out.println("���������� char1 = " + char1);
        char char2 = '�';
        System.out.println("���������� char1 = " + char2);
        char char3 = '_';
        System.out.println("���������� char1 = " + char3);
        char char4 = '\u0024';
        System.out.println("���������� char1 = " + char4);

        boolean bool1 = true;
        System.out.println("���������� bool1 = " + bool1);
        boolean bool2 = false;
        System.out.println("���������� bool2 = " + bool2);

    }
}
