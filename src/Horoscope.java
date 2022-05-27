import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
        String burc = "";
        boolean isError = false;

        System.out.print("Lutfen Yilin Kacinci Ayinda Dogdugunuzu Giriniz : ");
        month = input.nextInt();
        System.out.print("Lutfen Ayin Kacinci Gununde Dogdugunuzu Giriniz : ");
        day = input.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oglak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balik";
                    } else {
                        burc = "Koc";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koc";
                    } else {
                        burc = "Boga";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boga";
                    } else {
                        burc = "Ikizler";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Ikizler";
                    } else {
                        burc = "Yengec";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengec";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Basak";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Basak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oglak";
                    }
                } else {
                    isError = true;
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz ! ");
        } else {
            System.out.print("Burcunuz : " + burc);
        }
    }
}
