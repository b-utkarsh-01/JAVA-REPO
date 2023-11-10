import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class classAttendance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int present[][] = new int[4][4];
        String namePresent[][] = new String[1][1];
        String nameAbsent[][] = new String[1][1];
        String[][] studentName = {
                                    {
                                        " SHRUTI SHUKLA 22100BTCSE11784",
                                        " SHUBHAM PATIDAR 22100BTCSE11785",
                                        " SIDDHARTH DESHMUKH 22100BTCSE11786",
                                        " SNEHA DHODHARIYA 22100B   TCSE11790",
                                    }
                                };
        
        for (int i = 0; i < studentName.length; i++) {
            for (int j = 0; j < studentName[i].length; j++) {
                System.out.println(studentName[i][j]);
                present[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0;i<studentName.length;i++){
            for(int j=0;j<studentName[i].length;i++){
                if(present[i][j]==1){
                    namePresent[i][j]=studentName[i][j];
                }
                else if(present[i][j]==0){
                    nameAbsent[i][j]=studentName[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Attendance is now done");
        for(String i[]:namePresent){
            for(String j : i){
                JOptionPane.showMessageDialog(null,Arrays.toString(j));
            }
        }
        scan.close();
    }
}
// class AttendanceManager {
//     public static void takeAttendance() {
//         Scanner scan = new Scanner(System.in);
//         int present[][] = new int[8][9];
//         String namePresent[][] = new String[8][9];
//         String nameAbsent[][] = new String[8][9];
//         String[][] studentName = {
//                                     {
//                                         " SHRUTI SHUKLA 22100BTCSE11784",
//                                         " SHUBHAM PATIDAR 22100BTCSE11785",
//                                         " SIDDHARTH DESHMUKH 22100BTCSE11786",
//                                         " SNEHA DHODHARIYA 22100B   TCSE11790",
//                                         " SNEHA YADAV 22100BTCSE11791",
//                                         " SOMYA NIGAM 22100BTCSE11793",
//                                         " SOMYA SHRIVASTAVA 22100BTCSE11794",
//                                         " SONU DHODHARIYA 22100BTCSE11795",
//                                         " SOUMYA JAIN 22100BTCSE11796",
//                                     },
//                                     // {
//                                     //     " SOURABH PATIDAR 22100BTCSE11797",
//                                     //     " SOURABH SINGH RAJPUT 22100BTCSE11798",
//                                     //     " SOWMYA PATEL 22100BTCSE11799",
//                                     //     " SUHANI KAUSHAL 22100BTCSE11801",
//                                     //     " SUJAL NERNIYA 22100BTCSE11802",
//                                     //     " SUMAN PANCHAL 22100BTCSE11803",
//                                     //     " SUMIT GORE 22100BTCSE11804",
//                                     //     " SURAJ PATIDAR 22100BTCSE11805",
//                                     //     " SWAYAM DHAMUNIA 22100BTCSE11806",
//                                     // },
//                                     // {
//                                     //     " SWIKRUTI SINGH CHOUHAN 22100BTCSE11807",
//                                     //     " TANAY NAGDE 22100BTCSE11808",
//                                     //     " TANISH KUMAR JAIN 22100BTCSE11809",
//                                     //     " TANISHA PATIDAR 22100BTCSE11810",
//                                     //     " TANISHA RAMBADIA 22100BTCSE11811",
//                                     //     " TANUSHKA BHATNAGAR 22100BTCSE11813",
//                                     //     " TARU TIWARI 22100BTCSE11814",
//                                     //     " TARUN KUMAR WAGELA 22100BTCSE11815",
//                                     //     " TEBA SHAIKH 22100BTCSE11816",
//                                     // },
//                                     // {
//                                     //     " TEJAS BHOSLE 22100BTCSE11818",
//                                     //     " TINA PATIDAR 22100BTCSE11819",
//                                     //     " TISHA JAISWAL 22100BTCSE11820",
//                                     //     " TUSHAR 22100BTCSE11821",
//                                     //     " TUSHAR DOGNE 22100BTCSE11822",
//                                     //     " TUSHAR RENA 22100BTCSE11825",
//                                     //     " UJJWAL GOLAWAT 22100BTCSE11826",
//                                     //     " UPKAR SONI 22100BTCSE11827",
//                                     //     " URVASHI CHAVHAN 22100BTCSE11828",
//                                     // },
//                                     // {
//                                     //     " UTKARSH MISHRA 22100BTCSE11829",
//                                     //     " UTKARSH PATHAK 22100BTCSE11830",
//                                     //     " UTTKARSH PALIWAL 22100BTCSE11831",
//                                     //     " VAIBHAV KANTHIYA 22100BTCSE11833",
//                                     //     " VAIBHAV MATHUR 22100BTCSE11834",
//                                     //     " VAIBHAV MODI 22100BTCSE11835",
//                                     //     " VAIDEHI GUPTA 22100BTCSE11836",
//                                     //     " VAIDEHI MALVIYA 22100BTCSE11837",
//                                     //     " VAIDISH JOSHI 22100BTCSE11838",
//                                     // },
//                                     // {
//                                     //     " VANSHIKA JHALA 22100BTCSE11841",
//                                     //     " VANSHIKA MUDGAL 22100BTCSE11842",
//                                     //     " VANSHIKA SAHU 22100BTCSE11843",
//                                     //     " VANSHITA PANCHAL 22100BTCSE11844",
//                                     //     " VARSHA NAGAR 22100BTCSE11845",
//                                     //     " VIDHAN TAYADE 22100BTCSE11846",
//                                     //     " VIDHI KASHYAP 22100BTCSE11847",
//                                     //     " VIDHI SHARMA 22100BTCSE11848",
//                                     //     " VIDHYANSHU PATIDAR 22100BTCSE11849",
//                                     // },
//                                     // {
//                                     //     " VIKASH SINGH BAIRAGAD 22100BTCSE11852",
//                                     //     " VINAY RATHORE 22100BTCSE11854",
//                                     //     " VINAY WAGADRE 22100BTCSE11855",
//                                     //     " VINAYAK KUSHWAH 22100BTCSE11856",
//                                     //     " VINIT MALWE 22100BTCSE11857",
//                                     //     " VIPUL GOKUL PATIL 22100BTCSE11859",
//                                     //     " VIRENDRA SINGH 22100BTCSE11860",
//                                     //     " VISHAL MUKATI 22100BTCSE11861",
//                                     //     " VISHWRAJ CHOUHAN 22100BTCSE11862",
//                                     // },
//                                     // {
//                                     //     " VIVEK KHAIRNAR 22100BTCSE11863",
//                                     //     " VIVEK PANWAR 22100BTCSE11864",
//                                     //     " VIVEK PATEL 22100BTCSE11865",
//                                     //     " YASH CHANDEL 22100BTCSE11867",
//                                     //     " YASH GOUTAM 22100BTCSE11868",
//                                     //     " YASH NAMDEV 22100BTCSE11870",
//                                     // }
//                                 };
        
//         for (int i = 0; i < studentName.length; i++) {
//             for (int j = 0; j < studentName[i].length; j++) {
//                 present[i][j] = scan.nextInt();
//                 // Integer.parseInt(JOptionPane.showInputDialog( studentName[i][j] +"\n                  Is present :- "));
//             }
//         }
        
//         for(int i=0;i<studentName.length;i++){
//             for(int j=0;j<studentName[i].length;i++){
//                 if(present[i][j]==1){
//                     namePresent[i][j]=studentName[i][j];
//                 }
//                 else if(present[i][j]==0){
//                     nameAbsent[i][j]=studentName[i][j];
//                 }
//             }
//         }
//         JOptionPane.showMessageDialog(null, "Attendance is now done");
//         for(String i[]:namePresent){
//             for(String j : i){
//                 JOptionPane.showMessageDialog(null,Arrays.deepToString(studentName));
//             }
//         }
//         scan.close();
//     }
// }




                                        // " SNEHA YADAV 22100BTCSE11791",
                                        // " SOMYA NIGAM 22100BTCSE11793",
                                        // " SOMYA SHRIVASTAVA 22100BTCSE11794",
                                        // " SONU DHODHARIYA 22100BTCSE11795",
                                        // " SOUMYA JAIN 22100BTCSE11796",
                                    // },
                                    // {
                                    //     " SOURABH PATIDAR 22100BTCSE11797",
                                    //     " SOURABH SINGH RAJPUT 22100BTCSE11798",
                                    //     " SOWMYA PATEL 22100BTCSE11799",
                                    //     " SUHANI KAUSHAL 22100BTCSE11801",
                                    //     " SUJAL NERNIYA 22100BTCSE11802",
                                    //     " SUMAN PANCHAL 22100BTCSE11803",
                                    //     " SUMIT GORE 22100BTCSE11804",
                                    //     " SURAJ PATIDAR 22100BTCSE11805",
                                    //     " SWAYAM DHAMUNIA 22100BTCSE11806",
                                    // },
                                    // {
                                    //     " SWIKRUTI SINGH CHOUHAN 22100BTCSE11807",
                                    //     " TANAY NAGDE 22100BTCSE11808",
                                    //     " TANISH KUMAR JAIN 22100BTCSE11809",
                                    //     " TANISHA PATIDAR 22100BTCSE11810",
                                    //     " TANISHA RAMBADIA 22100BTCSE11811",
                                    //     " TANUSHKA BHATNAGAR 22100BTCSE11813",
                                    //     " TARU TIWARI 22100BTCSE11814",
                                    //     " TARUN KUMAR WAGELA 22100BTCSE11815",
                                    //     " TEBA SHAIKH 22100BTCSE11816",
                                    // },
                                    // {
                                    //     " TEJAS BHOSLE 22100BTCSE11818",
                                    //     " TINA PATIDAR 22100BTCSE11819",
                                    //     " TISHA JAISWAL 22100BTCSE11820",
                                    //     " TUSHAR 22100BTCSE11821",
                                    //     " TUSHAR DOGNE 22100BTCSE11822",
                                    //     " TUSHAR RENA 22100BTCSE11825",
                                    //     " UJJWAL GOLAWAT 22100BTCSE11826",
                                    //     " UPKAR SONI 22100BTCSE11827",
                                    //     " URVASHI CHAVHAN 22100BTCSE11828",
                                    // },
                                    // {
                                    //     " UTKARSH MISHRA 22100BTCSE11829",
                                    //     " UTKARSH PATHAK 22100BTCSE11830",
                                    //     " UTTKARSH PALIWAL 22100BTCSE11831",
                                    //     " VAIBHAV KANTHIYA 22100BTCSE11833",
                                    //     " VAIBHAV MATHUR 22100BTCSE11834",
                                    //     " VAIBHAV MODI 22100BTCSE11835",
                                    //     " VAIDEHI GUPTA 22100BTCSE11836",
                                    //     " VAIDEHI MALVIYA 22100BTCSE11837",
                                    //     " VAIDISH JOSHI 22100BTCSE11838",
                                    // },
                                    // {
                                    //     " VANSHIKA JHALA 22100BTCSE11841",
                                    //     " VANSHIKA MUDGAL 22100BTCSE11842",
                                    //     " VANSHIKA SAHU 22100BTCSE11843",
                                    //     " VANSHITA PANCHAL 22100BTCSE11844",
                                    //     " VARSHA NAGAR 22100BTCSE11845",
                                    //     " VIDHAN TAYADE 22100BTCSE11846",
                                    //     " VIDHI KASHYAP 22100BTCSE11847",
                                    //     " VIDHI SHARMA 22100BTCSE11848",
                                    //     " VIDHYANSHU PATIDAR 22100BTCSE11849",
                                    // },
                                    // {
                                    //     " VIKASH SINGH BAIRAGAD 22100BTCSE11852",
                                    //     " VINAY RATHORE 22100BTCSE11854",
                                    //     " VINAY WAGADRE 22100BTCSE11855",
                                    //     " VINAYAK KUSHWAH 22100BTCSE11856",
                                    //     " VINIT MALWE 22100BTCSE11857",
                                    //     " VIPUL GOKUL PATIL 22100BTCSE11859",
                                    //     " VIRENDRA SINGH 22100BTCSE11860",
                                    //     " VISHAL MUKATI 22100BTCSE11861",
                                    //     " VISHWRAJ CHOUHAN 22100BTCSE11862",
                                    // },
                                    // {
                                    //     " VIVEK KHAIRNAR 22100BTCSE11863",
                                    //     " VIVEK PANWAR 22100BTCSE11864",
                                    //     " VIVEK PATEL 22100BTCSE11865",
                                    //     " YASH CHANDEL 22100BTCSE11867",
                                    //     " YASH GOUTAM 22100BTCSE11868",
                                    //     " YASH NAMDEV 22100BTCSE11870",
                                    // }
                                // };