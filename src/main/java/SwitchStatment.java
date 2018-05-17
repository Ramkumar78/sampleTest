public class SwitchStatment {


    public String switchCollector(String swich) {

        return swich;
    }

    public int swichExecutor(int x, int z, String swich) {

        int add, sub, xz = 0;

        switch (swich) {


            case "add":

            {
                xz = x + z;
                System.out.println(xz);
                break;
            }

            case "sub": {
                if (x > z) {
                    xz = x - z;
                } else {
                    xz = z - x;
                }

                System.out.println(xz);
                break;
            }
            default:
                xz = 13;

        }

        return xz;
    }


}
