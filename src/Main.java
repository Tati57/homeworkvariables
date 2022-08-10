public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// Task1
int cat = 1;
byte dog = 9;
long hippo = 120L;
double dogWeight = 15.7;
float catWeight = 1.2f;
boolean hippoIsBig = hippo > 100;
char bar = 30;


//Task 2
double boxer1 = 78.2;
double boxer2 = 82.7;
System.out.println("weightOfAllBoxers" + (boxer1 + boxer2));
System.out.println("weightDifference" + Math.abs(boxer1-boxer2));

//Task 3
int bananas = 5;
int bananaWeight = 80;
int milk = 2;
int milkWeigth = 105;
int iceCream = 2;
int iceCreamWeight= 100;
int eggs = 4;
int eggWeight = 70;
int totalWeight = bananas * bananaWeight + milk * milkWeigth + iceCream * iceCreamWeight + eggs * eggWeight;
double totalWeightInKg = totalWeight / 1_000D;
System.out.println(totalWeightInKg);

// Task 4
double weightForLose = 7000;
int minLoseWeightPerDay = 250;
int maxLoseWeightForDay = 500;
double averageLoseWeightPerDay = minLoseWeightPerDay + (maxLoseWeightForDay - minLoseWeightPerDay) / 2D;
System.out.println (averageLoseWeightPerDay);
System.out.println ( " Maximum days for losing weight" + weightForLose / minLoseWeightPerDay);
System.out.println ( "Minimum days for losing weight" + weightForLose / maxLoseWeightForDay);
System.out.println(" Average quantity of days for losing weight" + weightForLose / averageLoseWeightPerDay;

// Task 5
int  mashaSalary = 67_760;
int denisSalary = 83_690;
int kristinaSalary = 76_230;

double indexPercent = 1.1;

int newMashaSalary = (int) (mashaSalary * indexPercent);
int newDenisSalary = (int) (denisSalary * indexPercent);
int newKristinaSalary = (int) (kristinaSalary * indexPercent);

int mashaSalaryYearChanged = 12 * (newMashaSalary - mashaSalary);
int denisSalaryYearChanged = 12 * (newDenisSalary - denisSalary);
int kristinaSalaryYearChanged = 12 * (newKristinaSalary - kristinaSalary);

System.out.println( " Маша теперь получает" + newMashaSalary + "рублей. Годовой доход вырос на" + mashaSalaryYearChanged);
System.out.println( "Денис теперь получает" + newDenisSalary + "рублей. Годовой доход вырос на " + denisSalaryYearChanged);
System.out.println ("Кристина теперь получает" + newKristinaSalary + "рублей. Годовой доход вырос на " + kristinaSalaryYearChanged);
