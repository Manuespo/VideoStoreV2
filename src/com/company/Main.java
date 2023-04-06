package com.company;

public class Main {

    public static void main(String[] args) {
    VideoStore vd=new VideoStore();
    vd.addCustomer("Manuel Esposito",2234484,"Quiroga4265");
    vd.addCustomer("Juan Perez", 5551234, "Calle 1 #123");
    vd.addCustomer("Maria Garcia", 555234, "Calle 2 #456");
    vd.addCustomer("Pedro Ramirez", 5553456, "Calle 3 #789");
    vd.addCustomer("Ana Rodriguez", 5554567, "Calle 4 #012");
    vd.addCustomer("Luisa Sanchez", 5555678, "Calle 5 #345");
    vd.addFilm("The Dark Knight", "2008-07-18", 152, 16, "USA", "A masked vigilante battles against crime and corruption in Gotham City.", Category.ACTION, 10);
    vd.addFilm("Indiana Jones and the Raiders of the Lost Ark", "1981-06-12", 115, 7, "USA", "Archaeologist and adventurer Indiana Jones is hired by the US government to find the Ark of the Covenant before the Nazis can get their hands on it.", Category.ADVENTURE, 5);
    vd.addFilm("Bridesmaids", "2011-04-28", 125, 14, "USA", "A maid of honor competes with a bridesmaid for the attention of the bride-to-be's best man.", Category.COMEDY, 8);
    vd.addFilm("March    of the Penguins", "2005-01-26", 80, 0, "France", "A documentary that follows the life cycle of emperor penguins in Antarctica.", Category.DOCUMENTARY, 3);
    vd.addFilm("The Shawshank Redemption", "1994-09-23", 142, 13, "USA", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", Category.DRAMA, 12);
    vd.addFilm("Nightmare on Elm Street", "1984-11-16", 91, 18, "USA", "A group of teenagers are terrorized by Freddy Krueger, an evil being from another world who kills them in their dreams.", Category.HORROR, 6);
    vd.addFilm("Die Hard", "1988-07-15", 131, 18, "USA", "John McClane, an off-duty cop, tries to save his wife and several others taken hostage by German terrorists during a Christmas party at the Nakatomi Plaza in Los Angeles.", Category.ACTION, 9);
    vd.addFilm("Jurassic Park", "1993-06-11", 127, 13, "USA", "A pragmatic paleontologist visiting an almost complete theme park is tasked with protecting a couple of kids after a power failure causes the park's cloned dinosaurs to run loose.", Category.ADVENTURE, 7);
    vd.addFilm("The Hangover", "2009-06-05", 100, 18, "USA", "Three friends wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing.", Category.COMEDY, 11);
    vd.addFilm("Planet Earth", "2006-03-05", 550, 0, "UK", "A documentary series that explores the beauty and diversity of the natural world.", Category.DOCUMENTARY, 4);
    vd.addFilm("The Godfather", "1972-03-24", 175, 18, "USA", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", Category.DRAMA, 15);
    vd.addFilm("The Exorcist", "1973-12-26", 122, 18, "USA", "When a teenage girl is possessed by a mysterious entity, her mother seeks the help of two priests to save her daughter.", Category.HORROR, 5);
    vd.addFilm("Terminator 2: Judgment Day", "1991-07-03", 137, 15, "USA", "A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son, John Connor, from a more advanced and powerful cyborg.", Category.ACTION, 8);
    vd.addFilm("Back to the Future", "1985-07-03", 116, 7, "USA", "A teenager is accidentally sent 30 years into the past in a time-traveling DeLorean invented by his friend, Dr. Emmett Brown, and must make sure his high-school-age parents unite in order to save his own existence.", Category.ADVENTURE, 6);
    vd.addFilm("Superbad", "2007-08-17", 113, 16, "USA", "Two co-dependent high school seniors are forced to deal with separation anxiety after their plan to stage a booze-soaked party goes awry.", Category.COMEDY, 9);

    vd.rentByTitle("The Dark Knight","Manuel Esposito",2234484,"Quiroga4265",4);
    vd.rentByTitle("Indiana Jones and the Raiders of the Lost Ark","Juan Perez", 5551234, "Calle 1 #123",3);
    System.out.println(vd.showFilms());

    }
}