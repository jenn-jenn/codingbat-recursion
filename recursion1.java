public class recursion1 {
    public int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies == 1) {
            return 2;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        int ears = 0;
        if (bunnies % 2 == 0) {
            ears = 3;
        } else {
            ears = 2;
        }
        return ears + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        if (n % 10 == 7) {
            count = 1;
        }
        return count + count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        if (n % 10 == 8) {
            count = 1;
            if ((n / 10) % 10 == 8) {
                count += 1;
            }
        }
        return count + count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {

        if (str.length() == 0) {
            return 0;
        }

        int count = 0;
        if (str.charAt(0) == 'x') {
            count += 1;
        }
        return count + countX(str.substring(1));
    }

    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }

        int count = 0;
        String s = str.substring(0, 2);
        if (s.equals("hi")) {
            count += 1;
        }
        return count + countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        char cStr[] = str.toCharArray();
        if (cStr[0] == 'x') {
            cStr[0] = 'y';
        }
        return String.valueOf(cStr[0]) + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.substring(0, 1);
        }
        String piS = "";
        int startIdx = 1;
        int endIdx = 1;
        if (str.substring(0, 2).equals("pi")) {
            piS = "3.14";
            startIdx = 2;
            endIdx = 0;
        }

        return str.substring(0, endIdx) + piS + changePi(str.substring(startIdx));
    }

    public String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        String theChar = str.substring(0, 1);
        if (theChar.equals("x")) {
            theChar = "";
        }
        return theChar + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        boolean res = false;
        if (nums[index] == 6) {
            res = true;
        }
        return res || array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        int count = 0;
        if (nums[index] == 11) {
            count += 1;
        }
        return count + array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length == 0) {
            return false;
        }
        if (index == nums.length - 1) {
            return false;
        }
        boolean res = false;
        if (nums[index + 1] == 10 * nums[index]) {
            res = true;
        }

        return res || array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.substring(0, 1);
        }

        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() <= 1) {
            return str.substring(0, 1);
        }

        String stars = "";
        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            stars = "*";
        }

        return str.substring(0, 1) + stars + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }

        String theChar = str.substring(0, 1);
        String anX = "";
        if (theChar.equals("x")) {
            theChar = "";
            anX = "x";
        }

        return theChar + endX(str.substring(1)) + anX;
    }

    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 1).equals(str.substring(2, 3))) {
            count += 1;
        }

        return count + countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        String s = str.substring(0, 3);
        if (s.equals("abc") || s.equals("aba")) {
            count++;
        }

        return count + countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        int skip = 1;
        String s = str.substring(0, 2);
        if (s.equals("11")) {
            count++;
            skip = 2;
        }
        return count + count11(str.substring(skip));
    }

    public String stringClean(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1);
        }
        if (str.length() < 2) {
            return "";
        }
        String theChar = str.substring(0, 1);
        String secondChar = str.substring(1, 2);
        if (theChar.equals(secondChar)) {
            theChar = "";
        }

        return theChar + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() == 2) {
            if (str.substring(0, 1).equals("h") && str.substring(1, 2).equals("i")) {
                return 1;
            }
        }
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        int skip = 1;
        String firstChar = str.substring(0, 1);
        String secondChar = str.substring(1, 2);
        String thirdChar = str.substring(2, 3);
        if (firstChar.equals("h") && secondChar.equals("i")) {
            count++;
            skip = 2;
        } else if (!firstChar.equals("x") && secondChar.equals("h") && thirdChar.equals("i")) {
            count++;
            skip = 3;
        } else if (firstChar.equals("x") && secondChar.equals("h") && thirdChar.equals("i")) {
            skip = 3;
        }

        return count + countHi2(str.substring(skip));
    }

    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }
        boolean isParen = false;
        if (str.substring(0, 1).equals("(") && str.substring(str.length() - 1).equals(")")) {
            isParen = true;
        }
        return isParen && nestParen(str.substring(1, str.length() - 1));
    }
    
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        int skip = 1;
        int count = 0;
        String s = str.substring(0, sub.length());
        if (s.equals(sub)) {
            count++;
            skip = sub.length();
        }

        return count + strCount(str.substring(skip), sub);
    }
    
    public String parenBit(String str) {
        // if(str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') return str;
        // else if (str.charAt(0) == '(') return parenBit(str.substring(0, str.length()
        // - 1));
        // else return parenBit(str.substring(1));

        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        return str;
    }
    
    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }

        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, --n);
        }
        return strCopies(str.substring(1), sub, n);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        countHi2("ahixhi");
        return;
    }
}