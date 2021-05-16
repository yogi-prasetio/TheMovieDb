package com.dicoding.submission.movies.model.utils

import com.dicoding.submission.movies.R
import com.dicoding.submission.movies.model.MoviesEntity
import com.dicoding.submission.movies.model.TvshowEntity

object DataDummy {
    fun generateDummyMovies(): ArrayList<MoviesEntity> {
        val movies = ArrayList<MoviesEntity>()

        movies.add(MoviesEntity(R.drawable.poster_a_star_is_born,
            "A Star Is Born ",
            "05/10/2018 (US)",
            "7.562",
            "2h 16m",
            "- Bradley Cooper (Director)\n" +
                    "- Will Fetters (Screenplay)\n"+
                    "- Eric Roth (Screenplay)\n"+
                    "- Robert Carson (Story)",
            "Action, Science Fiction, Adventure",
                "- Bradley Cooper \n- Lady Gaga \n- Sam Elliott \n- etc.",
            "\t\t\tSeasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."
        ))
        movies.add(MoviesEntity(R.drawable.poster_alita,
            "Alita: Battle Angel ",
                "14/02/2019 (US)",
                "7.750",
                "2h 2m",
                "- Robert Rodriguez (Director)\n" +
                        "- Laeta Kalogridis (Screenplay)\n"+
                        "- James Cameron (Screenplay)",
                "Action, Science Fiction, Adventure",
                "- Rosa Salazar \n- Christoph Waltz\n- Jennifer Connelly, etc.",
                "\t\t\tWhen Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
        ))
        movies.add(MoviesEntity(R.drawable.poster_aquaman,
            "Aquaman",
                "21/12/2018 (US)",
                "7.206",
                "2h 23m",
                "- James Wan (Director)\n" +
                        "- Will Beall (Screenplay)\n"+
                        "- David Leslie (Screenplay)\n"+
                        "- Mort Weisinger (Characters)",
                "Action, Adventure, Fantasy",
                "- Jason Mamoa \n- Amber Heard \n- Willem Dafoe \n- Patrick Wilson, etc.",
                "\t\t\tOnce home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."
        ))
        movies.add(MoviesEntity(R.drawable.poster_infinity_war,
                "Avengers: Infinity War",
                "27/04/2018 (US)",
                "8.331",
                "2h 29 m",
                "- Joe Russo (Director)\n"+
                        "- Anthony Russo (Director)\n"+
                        "- Christopher Markus (Screenplay)\n"+
                        "- Stephen McFeely (Screenplay)\n",
                "Adventure, Action, Science Fiction",
                "- Robert Downey Jr \n- Chris Hemsworth \n- Crish Evans \n- Scarlet Johansson, etc.",
                "\t\t\tAs the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
        ))
        movies.add(MoviesEntity(R.drawable.poster_bohemian,
            "Bohemian Rhapsody",
                "02/11/2018 (US)",
                "8.208",
                "2h 15m",
                "- Brian Singer (Director)\n" +
                        "- Anthony McCarten (Screenplay)\n"+
                        "- Peter Morgan (Story)",
                "Music, Drama, History",
                "- Rami Malek \n- Gwilym Lee \n- Ben Hardy, etc.",
                "\t\t\tSinger Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
        ))
        movies.add(MoviesEntity(R.drawable.poster_glass,
            "Glass",
                "18/01/2019 (US)",
                "6.860",
                "2h 9m",
                "- M. Night Shyamalan (Director)\n" +
                        "- M. Night Shyamalan (Screenplay)",
                "Thriller, Drama, Science Fiction",
                "- James McAvoy \n- Bruce Willis \n- Anya Taylor-Joy, etc.",
                "\t\t\tIn a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."
        ))
        movies.add(MoviesEntity(R.drawable.poster_how_to_train,
                "How to Train Your Dragon",
                "22/02/2019 (US)",
                "7.956",
                "1h 44m",
                "- Dean DeBlois (Director)\n" +
                        "- Cressida Cowell (Novel)\n"+
                        "- Dean DeBlois (Screenplay)",
                "Animation, Family, Adventure",
                "- Jay Baruchel \n- Gerard Butler \n- Craig Ferguson, etc.",
                "\t\t\tAs Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
        ))
        movies.add(MoviesEntity(R.drawable.poster_master_z,
                "Master Z: Ip Man Legacy",
                "26/12/2018 (TW)",
                "7.548",
                "1h 47m",
                "- Yuen Woo-Ping (Director)\n"+
                        "- Chan Tai-Li (Screenplay)\n"+
                        "- Edmond Wong (Screenplay)",
                "Genre: Action",
                "- Zhang Jin \n- Dave Bautista \n- Liu Yan, etc.",
                "\t\t\tFollowing his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight."
        ))
        movies.add(MoviesEntity(R.drawable.poster_mortal_engines,
                "Mortal Engines",
                "14/12/2018 (US)",
                "6.513",
                "2h 9m",
                "- Christian Rivers (Director)\n"+
                        "- Philip Reeve (Novel)\n"+
                        "- Peter Jackson (Screenplay)\n"+
                        "- Fran Walsh (Screenplay)",
                "Adventure, Science Fiction",
                "- Hera Hilmar \n- Robert Sheehan \n- Hugo Weaving \n- etc.",
                "\t\t\tMany thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."
        ))
        movies.add(MoviesEntity(R.drawable.poster_robin_hood,
                "Robin Hood",
                "21/11/2018 (US)",
                "6.312",
                "1h 56m",
                "- Otto Bathurst (Director)\n"+
                        "- Ben Chandler (Screenplay)\n"+
                        "- David James Kelly (Screenplay)",
                "Adventure, Action, Thriller",
                "- Taron Egerton \n- Jamie Foxx \n- Ben Mendelsohn, etc.",
                "\t\t\tA war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
        ))
        movies.add(MoviesEntity(R.drawable.poster_spiderman,
                "Spider-Man: Into the Spider-Verse",
                "14/12/2018 (US)",
                "8.474",
                "1h 57m",
                "- Rodney Rothman (Director)\n"+
                        "- Phil Lord (Screenplay)\n"+
                        "- Stan Lee (Characters)\n"+
                        "- Peter Ramsey (Director)",
                "Action, Adventure, Animation",
                "- Shameik Moore \n- Jake Johnson \n- Hailee Steinfeld \n- etc.",
                "\t\t\tMiles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
        ))
        return movies
    }

    fun generateDummyTvShows(): ArrayList<TvshowEntity> {
        val tv_shows = ArrayList<TvshowEntity>()

        tv_shows.add(TvshowEntity(R.drawable.poster_arrow_tv,
                "Arrow",
                "2012",
                "8.281",
                "Crime, Drama, Mystery, Action & Adventure",
                "42minutes",
                "\t\t\tSpoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "- Greg Berlanti\n"+
                        "- Marc Guggenheim\n"+
                        "- Andrew Kreisberg",
                "- Stephen Amell \n" +
                        "- David Ramsey\n" +
                        "- Emily Bett Rickards, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_dragon_ball_tv,
                "Dragon Ball",
                "1986",
                "8.433",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25minutes",
                "\t\t\tLong ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "Akira Toriyama",
                "- Masako Nozawa \n"+
                        "- Mayumi Tanaka\n"+
                        "- Hiromi Tsuru, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_family_guy_tv,
                "Family Guy",
                "1999",
                "8.281",
                "Animation, Comedy",
                "22m",
                "\t\t\tSick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "Seth MacFarlane",
                "- Mike Henry\n" +
                        "- Patrick Warburton\n" +
                        "- Adam West, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_flash_tv,
                "The Flash",
                "2014",
                "8.267",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "\t\t\tAfter a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only meta-human who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "- Greg Berlanti\n"+
                        "- Geoff Johns\n"+
                        "- Andrew Kreisberg",
                "- Series Grant Gustin\n" +
                        "- Carlos Valdes\n" +
                        "- Danielle Panabaker, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_gotham_tv,
                "Gotham",
                "2014",
                "8.245",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43minutes",
                "\t\t\tEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "Bruno Heller",
                "- Ben McKenzie\n" +
                        "- Donal Logue\n" +
                        "- David Mazouz, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_hanna_tv,
                "Hanna",
                "2019",
                "8.076",
                "Action & Adventure, Drama",
                "50minutes",
                "\t\t\tThis thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "David Farr",
                "- Esme Creed-Miles\n" +
                        "- Mireille Enos\n" +
                        "- Noah Taylor, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_iron_fist_tv,
                "Marvel's Iron Fist",
                "2017",
                "7.145",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55minutes",
                "\t\t\tDanny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "Scott Buck",
                "- Finn Jones\n" +
                        "- Jessica Henwick\n" +
                        "- Jessica Stroup, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_naruto_shipudden_tv,
                "Naruto Shippūden",
                "2007",
                "8.331",
                "Animation, Action & Adventure, Fantasy",
                "25minutes",
                "\t\t\tNaruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "Masashi Kishimoto",
                "- Jouji Nakata\n" +
                        "- Junko Takeuchi\n" +
                        "- Chie Nakamura, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_supernatural_tv,
                "Supernatural",
                "2005",
                "8.836",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45minutes",
                "\t\t\tWhen they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "Eric Kripke",
                "- Jared Padalecki\n" +
                        "- Jensen Ackles\n" +
                        "- Misha Collins, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_the_simpson_tv,
                "The Simpsons",
                "1989",
                "8.256",
                "Family, Animation, Comedy",
                "22minutes",
                "\t\t\tSet in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Matt Groening",
                "- Dan Castellaneta\n" +
                        "- Julie Kavner\n" +
                        "- Nancy Cartwright, etc."
        ))
        tv_shows.add(TvshowEntity(R.drawable.poster_the_walking_dead_tv,
                "The Walking Dead",
                "2010",
                "8.783",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42minutes",
                "\t\t\tSheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "Frank Darabont",
                "- Norman Reedus\n" +
                        "- Melissa McBride\n" +
                        "- Lauren Cohan, etc."
        ))
        return tv_shows
    }
}