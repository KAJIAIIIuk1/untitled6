public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte sugar = 123;
        System.out.println("вес мешка сахара " + sugar + " кг");

        short kamaz = 3500;
        System.out.println("вес камаза "+ kamaz + " кг");

        int most = 1248930287;
        System.out.println(" вес моста " + most + " кг");

        long a = 158l;
        System.out.println("где то есть такое число " + a + " в км ");

        float ad = 27.12f;
        System.out.println(ad);

        long card = 987678965549l;
        System.out.println("пароль от карты " + card);

        float fat = 2.786f;
        System.out.println("кто то сбросил " + fat + " калл");

        short soldat = 569;
        System.out.println(" где то в окопе сидит " + soldat + " солдат ");

        short weather = -159;
        System.out.println( " на улице " + weather + " градусов ");

        short iz = 27897;
        System.out.println( " ноги устали " + iz + " раз ");

        byte turnik = 67;
        System.out.println("сегодня подтянулся " + turnik + " раз");

        byte classEkaterina = 30;
        byte classludmila = 23;
        byte classAnna = 27;
        System.out.println(classEkaterina);
        System.out.println(classludmila);
        System.out.println(classAnna);
        short paper = 480;
        System.out.println(paper);
        int student = (classludmila + classEkaterina + classAnna);
        System.out.println(student);
        float studentPaper = paper / student;
        System.out.println(studentPaper);

        int DurationTwoMinutes = 16;
        int DurationTwentyMinutes = DurationTwoMinutes * 10;
        int DurationOnedays = DurationTwentyMinutes * 3 * 24;
        int DurationThreeDays = DurationOnedays * 3;
        int durationMonth = DurationThreeDays * 10;
        System.out.println("за 2 мин машина производит" + DurationTwoMinutes +  "штук бутылок");
        System.out.println("За 20 мин машина произвела " + DurationTwoMinutes + " штук бутылок ");
        System.out.println("за 24 час мошина произвела " + DurationOnedays + " штук бутылок" );
        System.out.println("за 3 дня машина производит " + DurationThreeDays +  " штук бутылок");
        System.out.println("за 1 месяц машина производит " + durationMonth + " штук бутылок");

        byte CansOfPaint = 120;
        byte classBrownPaintCans = 4;
        byte classWhiteCanOfPaint = 2;
        int classCans = CansOfPaint / (classBrownPaintCans + classWhiteCanOfPaint);
        int BrownPaintCans = classBrownPaintCans * classCans;
        int WhiteCanOfPaint = classWhiteCanOfPaint * classCans;
        System.out.println("В школе, где " + classCans + " классов, нужно " + WhiteCanOfPaint + " банок белой краски и " + BrownPaintCans + " банок коричневой краски");

        byte Banan = 5;
        byte Grammbanan = 80;
        int Allbanan = Banan * Grammbanan;
        System.out.println("в пяти бананах " + Allbanan +" грамм");
        int Milk = 200;
        byte MilkHundredMl = 105;
        int MilkTwoHundredMl = MilkHundredMl + MilkHundredMl;
        System.out.println("В двустах мл молока " + MilkTwoHundredMl + " гр");
        byte Plombir = 2;
        byte PlombirOne = 100;
        int PlombirTwo = Plombir * PlombirOne;
        System.out.println("В двух пломбирах " + PlombirTwo + " гр");
        byte RawEgg = 4;
        byte RawEggOne = 70;
        int RawEggFour = RawEgg * RawEggOne;
        System.out.println("в четырех сырых яйцах " + RawEggFour + " гр");
        int Koktel = Allbanan + MilkTwoHundredMl + PlombirTwo + RawEggFour;
        System.out.println("В коктеле из бананов,молока,пломбира и сырого яйца " + Koktel + " гр");
        float KoktelKg = Koktel / 1000;
        System.out.println("В коктеле из бананов,молока,пломбира и сырого яйца " + KoktelKg + " кг");

        int WeightSevenKg = 7 * 1000;
        int OneDay = 250;
        int Twoday = 500;
        int DayTrainingOne = WeightSevenKg / OneDay;
        int DayTriningTwo = WeightSevenKg / Twoday;
        System.out.println(" Чтобы сбросить семь кг веса,если терять по 250 гр в день то понадобится " + DayTrainingOne +" дней");
        System.out.println(" Чтобы сбросить семь кг веса,если терять по 500 гр в день то понадобится " + DayTriningTwo + " дней");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaUp = (Masha / 100) * 10 + Masha;
        System.out.println("Если маше увеличат зарплату на 10 % то она будет зарабатывать " + MashaUp + " руб в месяц");
        int DeniUp = (Denis / 100) * 10 + Denis;
        System.out.println("Если денису увеличат зарплату на 10 % то она будет зарабатывать " + DeniUp + " руб в месяц");
        int KristinaUp = (Kristina / 100) * 10 + Kristina;
        System.out.println("Если кристине увеличат зарплату на 10 % то она будет зарабатывать " + KristinaUp + " руб в месяц");
        int MashaYear = 67760 * 12;
        int MashaYaerUp = MashaUp * 12;
        System.out.println("до повышения маша получала " + MashaYear + " руб в год");
        System.out.println("после повышения маша стала получать " + MashaYaerUp + " руб в год");
        int DenisYaer = Denis * 12;
        int DenisYearUp = DeniUp * 12;
        System.out.println("до повышения денис получал " + DenisYaer + " руб в год");
        System.out.println("после повышения денис стал получать " + DenisYearUp + " руб в год");
        int KristinaYaer = Kristina * 12;
        int KristinaYaerUp = KristinaUp * 12;
        System.out.println("до повышения кристина получала " + KristinaYaer + " руб в год");
        System.out.println("после повышения кристина стала получать " + KristinaYaerUp + " руб в год");

    }
}