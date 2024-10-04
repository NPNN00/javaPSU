import java.util.*;


public class Lab1 {
    
    public static class Lab1Methods{
        public int sumLastNums(int x){
            //1.2 Сумма знаков
            return x/10%10 + x%10;
        }
        public void sumLastNumsTests(){
            //1.2 ТЕСТЫ
            int[] numbers = new int[]{4568,123,51,120};

            System.out.print("\nЗадание 1.2 //Сумма знаков\n");
            for (int number : numbers) {
                System.out.printf("\nx=%d\nРезультат:%d\n", number, sumLastNums(number));
            }
        }

        public boolean isPositive(int x){
            //1.4 Есть ли позитив
            return x>0;
        }
        public void isPositiveTests(){
            //1.4 ТЕСТЫ
            int[] numbers = new int[]{4568,-123,0,1};

            System.out.print("\nЗадание 1.4 //Есть ли позитив\n");
            for (int number : numbers) {
                System.out.printf("\nx=%d\nРезультат:%b\n", number, isPositive(number));
            }
        }

        public boolean isUpperCase(char x){
            //1.6 Большая буква
            return x>='A' && x<='Z';
        }
        public void isUpperCaseTests(){
            //1.6 ТЕСТЫ
            char[] symbols = new char[]{'1','Z','G','g','ж'};

            System.out.print("\nЗадание 1.6 //Большая буква\n");
            for (char symbol : symbols) {
                System.out.printf("\nx=%c\nРезультат:%b\n", symbol, isUpperCase(symbol));
            }
        }

        public boolean isDivisor(int a, int b){
            //1.8 Делитель
            return a!=0 && b!=0 && (a%b == 0 || b%a == 0);
        }
        public void isDivisorTests(){
            //1.8 ТЕСТЫ
            int[] numbers1 = new int[]{3,2,15,1};
            int[] numbers2 = new int[]{6,15,15,0};

            System.out.print("\nЗадание 1.8 //Делитель\n");
            for (int i = 0; i < numbers1.length; i++) {
                System.out.printf("\na=%d b=%d\nРезультат:%b\n", numbers1[i],numbers2[i], isDivisor(numbers1[i],numbers2[i]));
            }
        }

        public int lastNumSum(int a, int b){
            //1.10 Многократный вызов
            return a%10+b%10;
        }
        public void lastFiveNumSum(){
            //1.10 (многократный вызов с клавиатуры)
            int number1;
            int number2;
            StringBuilder result= new StringBuilder("\n");

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter five numbers by Enter");
            number1=input.nextInt();
            number2=input.nextInt();
            result.append(String.format("%d + %d это ", number1, number2));

            number1=lastNumSum(number1,number2);
            result.append(String.format("%d\n", number1));

            for (int i = 2; i < 5; i++)
            {
                number2=input.nextInt();
                result.append(String.format("%d + %d это ", number1, number2));
                number1=lastNumSum(number1,number2);
                result.append(String.format("%d\n", number1));
            }
            System.out.print(result);
            System.out.printf("Итого %d\n",number1);
        }
        public void lastFiveNumSum(int[] array){
            //1.10 (многократный вызов с массива)
            int number1;
            int number2;

            number1=lastNumSum(array[0],array[1]);
            System.out.printf("\n%d + %d это %d\n",array[0],array[1],number1);
            for (int i = 2; i < 5; i++)
            {
                number2=lastNumSum(number1,array[i]);
                System.out.printf("%d + %d это %d\n",number1,array[i],number2);
                number1=number2;
            }
            System.out.printf("Итого %d\n",number1);
        }
        public void lastNumSumTests(){
            //1.10 ТЕСТЫ
            System.out.print("\nЗадание 1.10 //Многократный вызов\n");
            lastFiveNumSum(new int[] {5,11,123,14,1});
            lastFiveNumSum(new int[] {42,59,12,1,20});
            lastFiveNumSum(new int[] {2521,1111,5215,52,28});
        }


        public int safeDiv(int x, int y){
            //2.2 Безопасное деление
            if(y==0){
                return 0;
            }
            return x/y;
        }
        public void safeDivTests(){
            //2.2 ТЕСТЫ
            int[] numbers1 = new int[]{3,6,6,1,0};
            int[] numbers2 = new int[]{6,3,6,0,1};

            System.out.print("\nЗадание 2.2 //Безопасное деление\n");
            for (int i = 0; i < numbers1.length; i++) {
                System.out.printf("\nx=%d y=%d\nРезультат:%d\n", numbers1[i],numbers2[i], safeDiv(numbers1[i],numbers2[i]));
            }
        }

        public String makeDecision(int x, int y){
            //2.4 Строка сравнения
            return switch (Integer.compare(x, y)) {
                case -1 -> String.format("%d<%d", x, y);
                case 0 -> String.format("%d==%d", x, y);
                default -> String.format("%d>%d", x, y);
            };
        }
        public void makeDecisionTests(){
            //2.4 ТЕСТЫ
            int[] numbers1 = new int[]{3,6,6};
            int[] numbers2 = new int[]{6,3,6};

            System.out.print("\nЗадание 2.4 //Строка сравнения\n");
            for (int i = 0; i < numbers1.length; i++) {
                System.out.printf("\nx=%d y=%d\nРезультат: %s\n", numbers1[i],numbers2[i], makeDecision(numbers1[i],numbers2[i]));
            }
        }

        public boolean sum3(int x, int y,int z){
            //2.6 Тройная сумма
            return x+y==z || x+z==y ||y+z==x;
        }
        public void sum3Tests(){
            //2.6 ТЕСТЫ
            int[] numbers1 = new int[]{3,3,6,1,2,-2};
            int[] numbers2 = new int[]{3,6,3,2,1,4};
            int[] numbers3 = new int[]{6,3,3,4,4,-6};

            System.out.print("\nЗадание 2.6 //Тройная сумма\n");
            for (int i = 0; i < numbers1.length; i++) {
                System.out.printf("\nx=%d y=%d z=%d\nРезультат: %s\n", numbers1[i],numbers2[i],numbers3[i], sum3(numbers1[i],numbers2[i],numbers3[i]));
            }
        }

        public String age(int x){
            //2.8 Возраст
            if(x%10 == 1 && x!=11){
                return String.format("%d год",x);
            } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14)) {
                return String.format("%d года ",x);
            }
            else{
                return String.format("%d лет",x);
            }
        }
        public void ageTests(){
            //2.8 ТЕСТЫ
            int[] ages = new int[]{3,9,11,21,23,12,16,100};

            System.out.print("\nЗадание 2.8 //Возраст\n");
            for (int age : ages) {
                System.out.printf("\nx=%d\nРезультат: %s\n", age, age(age));
            }
        }

        public void printDays(String x){
            //2.10 Вывод дней недели
            switch (x) {
                case "понедельник":
                    System.out.println("понедельник");
                case "вторник":
                    System.out.println("вторник");
                case "среда":
                    System.out.println("среда");
                case "четверг":
                    System.out.println("четверг");
                case "пятница":
                    System.out.println("пятница");
                case "суббота":
                    System.out.println("суббота");
                case "воскресенье":
                    System.out.println("воскресенье");
                    break;
                default:
                    System.out.println("это не день недели");
            }
            System.out.println();
        }
        public void printDaysTests(){
            //2.10 ТЕСТЫ
            String[] days = new String[]{"понедельник","четверг","воскресенье","выходной"};

            System.out.print("\nЗадание 2.10 //Вывод дней недели\n");
            for (String day : days) {
                System.out.printf("x=%s\nРезультат:\n",day);
                printDays(day);
            }
        }

        public String reverseListNums(int x){
            //3.2 числа наоборот
            String result= "";
            for (int i = x; i >= 0; i--) {
                result+=(String.format("%d ",i));
            }
            return result.trim();
        }
        public void reverseListNumsTest(){
            //3.2 ТЕСТЫ
            int[] numbers = new int[]{0,3,10};

            System.out.print("\nЗадание 3.2 //Числа наоборот\n");
            for (int number : numbers) {
                System.out.printf("\nx=%s\nРезультат: \"%s\"\n",number,reverseListNums(number));
            }
        }

        public int pow(int x,int y){
            //3.4 Степень числа
            int result=1;
            for (int i = 0; i < y; i++) {
                result*=x;
            }
            return result;
        }
        public void powTest(){
            //3.4 ТЕСТЫ
            int[] numbers = new int[]{2,2,3,0,-2,-2};
            int[] powers= new int[]{2,0,3,3,2,3};

            System.out.print("\nЗадание 3.4 //Степень числа\n");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("\nx=%s y=%d\nРезультат: %d\n",numbers[i],powers[i],pow(numbers[i],powers[i]));
            }
        }

        public boolean equalNum(int x){
            //3.6 Одинаковость
            int lastNumber;

            while (x!=0){
                lastNumber=x%10;
                x/=10;
                if(lastNumber != x%10 && x!=0)
                    return false;
            }
            return true;
        }
        public void equalNumTest(){
            //3.6 ТЕСТЫ
            int[] numbers = new int[]{1111, 1,110,0,101};

            System.out.print("\nЗадание 3.6 //Одинаковость\n");
            for (int number : numbers) {
                System.out.printf("\nx=%s\nРезультат: %b\n", number, equalNum(number));
            }
        }

        public void leftTraingle(int x){
            //3.8 Левый треугольник
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public void leftTraingleTest(){
            //3.8 ТЕСТЫ
            int[] numbers = new int[]{0,1,2,4};

            System.out.print("\nЗадание 3.8 //Левый треугольник\n");
            for (int number : numbers) {
                System.out.printf("\nx=%s\nРезультат:\n", number);
                leftTraingle(number);
            }
        }

        public void guessGame(boolean auto) {
            //3.10 Угадайка
            int tries = 0;
            Random ran = new Random();
            Scanner input = new Scanner(System.in);
            String randomNumber = Integer.toString(ran.nextInt(9));
            String guessedNumber="";
            System.out.print("\nЗадание 3.10 //Угадайка\n");
            System.out.println("Введите число от 0 до 9:");
            while (true) {
                tries += 1;
                if(auto){
                    guessedNumber = Integer.toString(ran.nextInt(9));
                    System.out.printf("*Ввели %s*\n",guessedNumber);
                }
                else {
                       guessedNumber=input.nextLine();
                }

                if (Objects.equals(guessedNumber, randomNumber)) {
                    break;
                } else {
                    System.out.println("Вы не угадали, введите число от 0 до 9:");
                }
            }
            System.out.printf("Вы угадали! Это было число %s\n", randomNumber);
            System.out.printf("Вы отгадали за %d попытки\n\n", tries);
        }

        public int findLast(int[] arr,int x){
            //4.2 Поиск последнего значения
            int result = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==x) result = i;
            }
            return result;
        }
        public void findLastTest(){
            //4.2 ТЕСТЫ
            int[][] numbers = new int[][]{new int[]{1,2,3,5},new int[]{1,2,3,5},new int[]{1,3,3,5},new int[]{1,2,4}};
            int[] guessedNumbers=new int[]{1,3,3,3};

            System.out.print("\nЗадание 4.2 //Поиск последнего значения\n");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("\narr=%s\nx=%d\nРезультат: %d\n", Arrays.toString(numbers[i]),guessedNumbers[i],findLast(numbers[i],guessedNumbers[i]));
            }
        }

        public int[] add(int[] arr,int x,int pos){
            //4.4 Добавление в массив
            int[] newArray = new int[arr.length+1];
            for (int i = 0; i < pos; i++) {
                newArray[i]=arr[i];
            }
            newArray[pos]=x;
            for (int i = pos+1; i < newArray.length; i++) {
                newArray[i]=arr[i-1];
            }

            return newArray;
        }
        public void addTest(){
            //4.4 ТЕСТЫ
            int[][] numbers = new int[][]{new int[]{1,2,3,5},new int[]{1,2,3,5},new int[]{1,2,4}};
            int[] newNumbers=new int[]{9,9,9};
            int[] positions=new int[]{0,3,3};

            System.out.print("\nЗадание 4.4 //Добавление в массив\n");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("\narr=%s\nx=%d\npos=%d\nРезультат: %s\n",
                        Arrays.toString(numbers[i]),
                        newNumbers[i],
                        positions[i],
                        Arrays.toString(add(numbers[i],newNumbers[i],positions[i])));
            }
        }

        public void reverse(int[] arr){
            //4.6 Реверс
            int temp;
            for (int i = 0; i < arr.length/2; i++) {
                temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
        }
        public void reverseTest(){
            //4.6 ТЕСТЫ
            int[][] arrays = new int[][]{new int[]{1,2,3,4},new int[]{1,2,3,4,5},new int[]{1},new int[]{}};

            System.out.print("\nЗадание 4.6 //Реверс\n");
            for (int i = 0; i < arrays.length; i++) {
                System.out.printf("\narr=%s\n", Arrays.toString(arrays[i]));
                reverse(arrays[i]);
                System.out.printf("Результат: ar=%s\n", Arrays.toString(arrays[i]));
            }
        }

        public int[] concat(int[] arr1,int[] arr2){
            //4.8 Объединение
            int[] newArr=new int[arr1.length+arr2.length];

            for (int i = 0; i < arr1.length; i++) {
                newArr[i]=arr1[i];
            }

            int k=arr1.length;
            for (int i = 0; i < arr2.length; i++) {
                newArr[k]=arr2[i];
                k++;
            }
            return  newArr;
        }
        public void concatTest(){
            //4.8 ТЕСТЫ
            int[][] arrays1 = new int[][]{new int[]{1,2,3}, new int[]{1},   new int[]{2,3}, new int[]{},    new int[]{2,3}};
            int[][] arrays2 = new int[][]{new int[]{4,5},   new int[]{2,3}, new int[]{1},   new int[]{2},   new int[]{}};
            System.out.print("\nЗадание 4.8 //Объединение\n");
            for (int i = 0; i < arrays1.length; i++) {
                System.out.printf("\narr1=%s\narr2=%s\nРезультат: %s\n",
                        Arrays.toString(arrays1[i]),
                        Arrays.toString(arrays2[i]),
                        Arrays.toString(concat(arrays1[i],arrays2[i])));
            }
        }

        public int[] deleteNegative(int[] arr){
            //4.10 Удалить негатив
            int countNonNegative=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>=0) countNonNegative++;
            }

            int[] newArr = new int[countNonNegative];
            int k=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>=0){
                    newArr[k]=arr[i];
                    k++;
                }
            }
            return  newArr;
        }
        public void deleteNegativeTest(){
            //4.10 ТЕСТЫ
            int[][] arrays = new int[][]{new int[]{1,2,3}, new int[]{1},   new int[]{-1}, new int[]{1,-2,3,-4,5},    new int[]{1,-2,3,-4},new int[]{}};
            System.out.print("\nЗадание 4.10 //Удалить негатив\n");
            for (int i = 0; i < arrays.length; i++) {
                System.out.printf("\narr=%s\nРезультат: %s\n",
                        Arrays.toString(arrays[i]),
                        Arrays.toString(deleteNegative(arrays[i])));
            }
        }
    }
    public static void main(String[] args) {
        Lab1Methods methods = new Lab1Methods();
//        methods.sumLastNumsTests();
//        methods.isPositiveTests();
//        methods.isUpperCaseTests();
//        methods.isDivisorTests();
//        methods.lastNumSumTests();
//
//        methods.safeDivTests();
//        methods.makeDecisionTests();
//        methods.sum3Tests();
//        methods.ageTests();
//        methods.printDaysTests();
//
//        methods.reverseListNumsTest();
//        methods.powTest();
//        methods.equalNumTest();
//        methods.leftTraingleTest();
        methods.guessGame(false);

//        methods.findLastTest();
//        methods.addTest();
//        methods.reverseTest();
//        methods.concatTest();
//        methods.deleteNegativeTest();
    }
}