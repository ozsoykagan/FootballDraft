
package footballdraft;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
        // Konsol çıktısını UTF-8 olarak zorluyoruz
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
    } catch (Exception e) {
        e.printStackTrace();
    }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Leaderboard leaderboard = new Leaderboard();
        // =========================
        // KULLANICI BİLGİLERİ
        // =========================
        System.out.print("=========================");
        System.out.print("OYUNA HOŞGELDİNİZ canerim yine yaptı izotaypa selamlar!");
        System.out.print("=========================");
        System.out.println();
        System.out.print("Adınız: ");
        String name = scanner.nextLine();

        System.out.print("Tuttuğunuz takım: ");
        String favoriteTeam = scanner.nextLine();

        User user = new User(name, favoriteTeam);

        System.out.println();
        System.out.println("================================");
        System.out.println("Hoş geldin " + user.getName());
        System.out.println("Tuttuğun takım: " + user.getFavoriteTeam());
        System.out.println("================================");
        


        // =========================
        // OYUNCU LİSTESİ
        // =========================

        ArrayList<Player> players = new ArrayList<>();

        // -------- KALECİLER --------
        players.add(new Player("Furkan Özsoy", "GK", 84));
        players.add(new Player("Donnarumma", "GK", 89));
        players.add(new Player("Courtois", "GK", 89));
        players.add(new Player("Alisson", "GK", 89));
        players.add(new Player("Ederson", "GK", 88));
        players.add(new Player("Neuer", "GK", 86));
        players.add(new Player("Oblak", "GK", 87));
        players.add(new Player("Emiliano Martinez", "GK", 86));
        players.add(new Player("Ter Stegen", "GK", 87));


        // -------- SOL BEKLER --------

        players.add(new Player("Theo Hernandez", "LB", 88));
        players.add(new Player("Alphonso Davies", "LB", 85));
        players.add(new Player("Nuno Mendes", "LB", 86));
        players.add(new Player("Andy Robertson", "LB", 83));
        players.add(new Player("Alejandro Balde", "LB", 81));
        players.add(new Player("Dimarco", "LB", 84));
        players.add(new Player("Grimaldo", "LB", 86));
        players.add(new Player("Estupinan", "LB", 80));


        // -------- STOPERLER --------

        players.add(new Player("Van Dijk", "CB", 89));
        players.add(new Player("Ruben Dias", "CB", 88));
        players.add(new Player("Saliba", "CB", 87));
        players.add(new Player("Antonio Rudiger", "CB", 87));
        players.add(new Player("Marquinhos", "CB", 87));
        players.add(new Player("Gabriel", "CB", 86));
        players.add(new Player("Alessandro Bastoni", "CB", 86));
        players.add(new Player("Pau Torres", "CB", 84));


        // -------- SAĞ BEKLER --------

        players.add(new Player("Achraf Hakimi", "RB", 89));
        players.add(new Player("Trent Alexander-Arnold", "RB", 86));
        players.add(new Player("Kyle Walker", "RB", 84));
        players.add(new Player("Reece James", "RB", 84));
        players.add(new Player("Jeremie Frimpong", "RB", 86));
        players.add(new Player("Dani Carvajal", "RB", 85));
        players.add(new Player("Kieran Trippier", "RB", 82));
        players.add(new Player("Pedro Porro", "RB", 84));


        // -------- DEFANSİF ORTA SAHA --------

        players.add(new Player("Rodri", "CDM", 91));
        players.add(new Player("Declan Rice", "CDM", 87));
        players.add(new Player("Joshua Kimmich", "CDM", 88));
        players.add(new Player("Aurelien Tchouameni", "CDM", 85));
        players.add(new Player("Casemiro", "CDM", 84));
        players.add(new Player("Bruno Guimaraes", "CDM", 86));
        players.add(new Player("Moises Caicedo", "CDM", 84));
        players.add(new Player("Martin Zubimendi", "CDM", 84));


        // -------- ORTA SAHA --------

        players.add(new Player("Jude Bellingham", "CM", 91));
        players.add(new Player("Kevin De Bruyne", "CM", 90));
        players.add(new Player("Pedri", "CM", 88));
        players.add(new Player("Federico Valverde", "CM", 88));
        players.add(new Player("Toni Kroos", "CM", 87));
        players.add(new Player("Bernardo Silva", "CM", 88));
        players.add(new Player("Frenkie de Jong", "CM", 87));
        players.add(new Player("Nicolo Barella", "CM", 86));


        // -------- OFANSİF ORTA SAHA --------

        players.add(new Player("Martin Odegaard", "CAM", 89));
        players.add(new Player("Jamal Musiala", "CAM", 88));
        players.add(new Player("Florian Wirtz", "CAM", 89));
        players.add(new Player("Cole Palmer", "CAM", 88));
        players.add(new Player("James Maddison", "CAM", 85));
        players.add(new Player("Phil Foden", "CAM", 89));
        players.add(new Player("Paulo Dybala", "CAM", 86));
        players.add(new Player("Bruno Fernandes", "CAM", 88));


        // -------- SOL KANAT --------

        players.add(new Player("Vinicius Jr", "LW", 90));
        players.add(new Player("Rafael Leao", "LW", 86));
        players.add(new Player("Khvicha Kvaratskhelia", "LW", 86));
        players.add(new Player("Luis Diaz", "LW", 85));
        players.add(new Player("Son Heung-min", "LW", 87));
        players.add(new Player("Jack Grealish", "LW", 84));
        players.add(new Player("Marcus Rashford", "LW", 83));
        players.add(new Player("Nico Williams", "LW", 85));


        // -------- SAĞ KANAT --------

        players.add(new Player("Mohamed Salah", "RW", 89));
        players.add(new Player("Lamine Yamal", "RW", 90));
        players.add(new Player("Bukayo Saka", "RW", 88));
        players.add(new Player("Rodrygo", "RW", 86));
        players.add(new Player("Ousmane Dembele", "RW", 88));
        players.add(new Player("Riyad Mahrez", "RW", 84));
        players.add(new Player("Lionel Messi", "RW", 88));
        players.add(new Player("Michael Olise", "RW", 85));


        // -------- FORVET --------

        players.add(new Player("Kylian Mbappe", "ST", 91));
        players.add(new Player("Erling Haaland", "ST", 91));
        players.add(new Player("Harry Kane", "ST", 90));
        players.add(new Player("Robert Lewandowski", "ST", 88));
        players.add(new Player("Lautaro Martinez", "ST", 88));
        players.add(new Player("Victor Osimhen", "ST", 87));
        players.add(new Player("Alexander Isak", "ST", 86));
        players.add(new Player("Julian Alvarez", "ST", 86));


        // -------- SOL ORTA --------

        players.add(new Player("Son Heung-min", "LM", 87));
        players.add(new Player("Luis Diaz", "LM", 85));
        players.add(new Player("Jack Grealish", "LM", 84));
        players.add(new Player("Kingsley Coman", "LM", 85));
        players.add(new Player("Allan Saint-Maximin", "LM", 82));
        players.add(new Player("Mikel Oyarzabal", "LM", 84));


        // -------- SAĞ ORTA --------

        players.add(new Player("Bukayo Saka", "RM", 88));
        players.add(new Player("Bernardo Silva", "RM", 88));
        players.add(new Player("Rodrygo", "RM", 86));
        players.add(new Player("Federico Chiesa", "RM", 84));
        players.add(new Player("Antony", "RM", 80));
        players.add(new Player("Yeremy Pino", "RM", 82));


        // -------- SOL KANAT BEK --------

        players.add(new Player("Theo Hernandez", "LWB", 88));
        players.add(new Player("Alphonso Davies", "LWB", 85));
        players.add(new Player("Nuno Mendes", "LWB", 86));
        players.add(new Player("Dimarco", "LWB", 84));
        players.add(new Player("Destiny Udogie", "LWB", 82));


        // -------- SAĞ KANAT BEK --------

        players.add(new Player("Achraf Hakimi", "RWB", 89));
        players.add(new Player("Jeremie Frimpong", "RWB", 86));
        players.add(new Player("Denzel Dumfries", "RWB", 84));
        players.add(new Player("Pedro Porro", "RWB", 84));
        players.add(new Player("Giovanni Di Lorenzo", "RWB", 82));


        // =========================
        // DİZİLİŞLER
        // =========================

        Formation formation1 = new Formation(
                "4-3-3",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "CDM", "CM", "CM",
                    "LW", "ST", "RW"
                }
        );

        Formation formation2 = new Formation(
                "4-2-3-1",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "CDM", "CDM",
                    "LW", "CAM", "RW",
                    "ST"
                }
        );

        Formation formation3 = new Formation(
                "4-4-2",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "LM", "CM", "CM", "RM",
                    "ST", "ST"
                }
        );

        Formation formation4 = new Formation(
                "3-5-2",
                new String[]{
                    "GK",
                    "CB", "CB", "CB",
                    "LWB", "CM", "CDM", "CM", "RWB",
                    "ST", "ST"
                }
        );

        Formation formation5 = new Formation(
                "4-1-4-1",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "CDM",
                    "LW", "CM", "CM", "RW",
                    "ST"
                }
        );

        Formation formation6 = new Formation(
                "4-3-1-2",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "CM", "CM", "CM",
                    "CAM",
                    "ST", "ST"
                }
        );

        Formation formation7 = new Formation(
                "4-2-2-2",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "CDM", "CDM",
                    "CAM", "CAM",
                    "ST", "ST"
                }
        );

        Formation formation8 = new Formation(
                "3-4-3",
                new String[]{
                    "GK",
                    "CB", "CB", "CB",
                    "LM", "CM", "CM", "RM",
                    "LW", "ST", "RW"
                }
        );

        Formation formation9 = new Formation(
                "5-3-2",
                new String[]{
                    "GK",
                    "LWB", "CB", "CB", "CB", "RWB",
                    "CM", "CM", "CM",
                    "ST", "ST"
                }
        );

        Formation formation10 = new Formation(
                "4-4-1-1",
                new String[]{
                    "GK", "LB", "CB", "CB", "RB",
                    "LM", "CM", "CM", "RM",
                    "CAM", "ST"
                }
        );


        // =========================
        // DİZİLİŞ LİSTESİ
        // =========================

        ArrayList<Formation> formations = new ArrayList<>();

        formations.add(formation1);
        formations.add(formation2);
        formations.add(formation3);
        formations.add(formation4);
        formations.add(formation5);
        formations.add(formation6);
        formations.add(formation7);
        formations.add(formation8);
        formations.add(formation9);
        formations.add(formation10);


        // =========================
        // RASTGELE 5 DİZİLİŞ
        // =========================

        ArrayList<Formation> availableFormations =
                new ArrayList<>(formations);

        ArrayList<Formation> shownFormations =
                new ArrayList<>();

        System.out.println();
        System.out.println("===== DİZİLİŞ SEÇ =====");

        for (int i = 0; i < 5; i++) {

            int randomIndex =
                    random.nextInt(availableFormations.size());

            Formation formation =
                    availableFormations.get(randomIndex);

            shownFormations.add(formation);

            System.out.println(
                    (i + 1)
                    + ". "
                    + formation.getName()
            );

            availableFormations.remove(randomIndex);
        }


        // =========================
        // DİZİLİŞ SEÇİMİ
        // =========================

        System.out.print("Diziliş seçiniz: ");

        int formationChoice = scanner.nextInt();

        if (formationChoice < 1 || formationChoice > 5) {

            System.out.println("Geçersiz seçim!");

            scanner.close();
            return;
        }

        Formation selectedFormation =
                shownFormations.get(formationChoice - 1);

        System.out.println();
        System.out.println(
                "Seçtiğiniz diziliş: "
                + selectedFormation.getName()
        );


        // =========================
        // SEÇİLEN OYUNCULAR
        // =========================

        ArrayList<Player> selectedPlayers =
                new ArrayList<>();


        // =========================
        // DRAFT SİSTEMİ
        // =========================

        String[] positions =
                selectedFormation.getPositions();

        for (String position : positions) {

            // Pozisyona uygun oyuncuları bul
            ArrayList<Player> positionPlayers =
                    new ArrayList<>();

            for (Player player : players) {

                if (player.getPosition().equals(position)) {

                    positionPlayers.add(player);
                }
            }


            // Yeterli oyuncu kontrolü
            if (positionPlayers.size() < 5) {

                System.out.println();
                System.out.println(
                        "HATA: "
                        + position
                        + " pozisyonunda yeterli oyuncu yok."
                );

                scanner.close();
                return;
            }


            // =========================
            // RASTGELE 5 OYUNCU
            // =========================

            ArrayList<Player> availablePlayers =
                    new ArrayList<>(positionPlayers);

            ArrayList<Player> options =
                    new ArrayList<>();

            for (int i = 0; i < 5; i++) {

                int randomIndex =
                        random.nextInt(
                                availablePlayers.size()
                        );

                Player player =
                        availablePlayers.get(randomIndex);

                options.add(player);

                availablePlayers.remove(randomIndex);
            }


            // =========================
            // OYUNCU SEÇİMİ
            // =========================

            System.out.println();
            System.out.println(
                    "===== "
                    + position
                    + " SEÇ ====="
            );

            for (int i = 0; i < options.size(); i++) {

                Player player =
                        options.get(i);

                System.out.println(
                        (i + 1)
                        + ". "
                        + player.getName()
                        + " - OVR "
                        + player.getOverall()
                );
            }


            System.out.print("Oyuncunuzu seçiniz: ");

            int playerChoice =
                    scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 5) {

                System.out.println("Geçersiz seçim!");

                scanner.close();
                return;
            }


            Player selectedPlayer =
                    options.get(playerChoice - 1);


            // Oyuncuyu kadroya ekle
            selectedPlayers.add(selectedPlayer);


            // Oyuncuyu havuzdan çıkar
            players.remove(selectedPlayer);


            System.out.println();
            System.out.println(
                    "Seçtiğiniz oyuncu: "
                    + selectedPlayer.getName()
                    + " - OVR "
                    + selectedPlayer.getOverall()
            );
        }


        // =========================
        // İLK 11
        // =========================

        System.out.println();
        System.out.println("========================================");
        System.out.println("              YOUR TEAM");
        System.out.println("========================================");

        for (Player player : selectedPlayers) {

            System.out.printf(
                    "%-4s | %-18s | %d%n",
                    player.getPosition(),
                    player.getName(),
                    player.getOverall()
            );
        }


        // =========================
        // TEAM OVERALL HESAPLA
        // =========================

        int totalOverall = 0;

        for (Player player : selectedPlayers) {

            totalOverall += player.getOverall();
        }

        double teamOverall =
                (double) totalOverall
                / selectedPlayers.size();


        // =========================
        // TEAM OVERALL GÖSTER
        // =========================

        System.out.println("========================================");

        System.out.printf(
                "Team Overall: %.2f%n",
                teamOverall
        );

        System.out.println("========================================");
        DraftResult result = new DraftResult(
        user.getName(),
        user.getFavoriteTeam(),
        selectedFormation.getName(),
        teamOverall
        );

        leaderboard.addResult(result);

        leaderboard.showLeaderboard();


        // =========================
        // PROGRAMI KAPAT
        // =========================

        scanner.close();
    }
}

