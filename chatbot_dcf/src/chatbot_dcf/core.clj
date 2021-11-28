(ns chatbot-dcf.core
  (:gen-class))

;;All the definition/librairies

(def Positif #{"yeah" "Y" "yes" "OK" "y" "ok" "Yes" "Yeah" "fine" "Fine" "Yep" "yep"})
(def theactivity #{"walk" "sport" "skiing" "dogs" "restaurants" "playground" "parking" "biking" "wc" "attraction"})
(def pragueparks #{
                   :a "bertramka" "Bertramka" 
                   :b "frantiskanska-zahrada" "Frantiskanska Zahrada"  "Frantiskanska zahrada" "frantiskanska Zahrada" 
                   :c"obora-hvezda" "Obora Hvezda" "Obora hvezda" "obora Hvezda" 
                   :d"kampa" "Kampa" 
                   :e"kinskeho-zahrada" "Kinskeho Zahrada" 
                   :f"klamovka" "Klamovka" 
                   :g"ladronka" "Ladronka" 
                   :h"letna" "Letna" 
                   :i"petrin" "Petrin" 
                   :j"riegrovy-sady" "Riegrovy Sady" "riegrovy Sady" "Riegrovy sady" 
                   :k"stromovka " "Stromovka" 
                   :l"vysehrad" "Vysehrad"}
                   
  )

(def exit #{"finish" "Finish" "End" "end" "Exit" "exit" "Stop" "stop" "Bye" "bye" "Quit" "quit" "Leave" "leave"}
  )


;;All the function I use in the programm
(defn not_understand 
  []
  (println "Can you retry please I didn't understand")
  )

(defn exit-end 
  []
  (println "Do really want to leave ?")
  (let [x (read-line)]
    (cond
      (contains? Positif x) (println "Ok, have a good day and I hope I will see you soon !")))
  )

(defn activity 
  []
  (println "What do you want to do today ?")
  (let  [a (read-line)]
    (cond
      (contains? theactivity y) (println "Ok I recommand you to go at a park to do that")
      (contains? exit y) (exit-end)))
  )

(defn Joke 
  []
  (println "Do you want to do an Iron-man?")
  (def joke (read-line))
  (println "HAHA it was just a joke don't panic")
  )

(defn  choice_park 
  []
  (println "I know 12 parks in Prague: 
                     1) Vysehrad
                     2) Stromovka  
                     3) Riegrovy Sady 
                     4) Petrin 
                     5) Letna  
                     6) Ladronka 
                     7) Klamovka   
                     8) Kinskeho Zahrada 
                     9) Kampa  
                    10) Obora Hvezda 
                    11) Frantiskanska Zahrada
                    12) Bertramka")
  )

(defn park_activity 
  []
    (choice_park)
    let [c (read-line)]
    (cond
      (contains? pragueparks c) 
      (contains? exit c) (exit-end)
      :else (not_understand)
    (cond
      (c = "bertramka") (println "The activities you can do in this park are: walk, biking, parking, attraction like cultural monument, classical music concerts, social events, W. A. ​​Mozart Museum and trams No. 4, 7, 9, 10, 58, 59")
      (c = "frantiskanska-zahrada") (println "The activities you can do in this park are: walk, biking, playground, wc, attraction like Church of Our Lady of the Snows and Václavské náměstí trams. No. 3, 9, 14, 24, 51, 52, 54, 55, 56, 58, metro A, B Můstek")
      (c = "obora-hvezda") (println "The activities you can do in this park are: walk, biking, skiing, playground, dogs, parking, wc, attraction like memorial trees, nature trail, nature attractions and Nad Markétou, bus no. 179, 184, 191, 510, Libocká - bus no. 179, 510, Vypich, tram no. 15, 22, 25, 57")
      (c = "kampa") (println "The activities you can do in this park are: walk, biking, skating, playground, wc, attraction like view of the Vltava, Sovovy Mlýny Gallery, Čertovka, Charles Bridge, Werich House, memorial trees and Hellichova tram no. 12, 20, 22, 23, 57, Újezd ​​tram no. 6, 9, 22, 23, 57, 58, 59")
      (c = "kinskeho-zahrada") (println "The activities you can do in this park are: walk, playground, parking, wc, attraction like museum,ornamental lakes, natural attraction - Petrin Rocks and Kobrova - BUS No. 176")
      (c = "klamovka") (println "The activities you can do in this park are: walk, biking, sport, dogs, restaurant, playground, wc, attraction like art gallery, historical attractions, music club and Klamovka - BUS No. 149, 191, 217, tram No. 4, 7, 9, 10, 58, 59")
      (c = "ladronka") (println "The activities you can do in this park are: walk, biking, parking, skating, restaurant, playground, dogs, wc, attraction like extensive leisure area, music and entertainment events and U Ladronky, Rozýnova, Štefkova BUS No. 191, Vypich BUS No. 108, 174, 180, 191, I3, tram No. 15, 22, 25, 57")
      (c = "letna") (println "The activities you can do in this park are: walk, biking, playground, dogs, restaurant, skating, parking, wc, attraction like extensive leisure area, cultural events and Letenské náměstí and Sparta tram no. 1, 8, 15, 25, 26, 51, 56, Čechův most tram no. 12, 17, 53, Chotkovy sady tram no. 18, 20, 57, metro Hradčanská")
      (c = "petrin") (println "The activities you can do in this park are: walk, biking, parking, playground, restaurant, skating, wc,attraction like lookout tower, maze, observatory, underground galleries and fruit orchards and Újezd ​​tram no. 6, 9, 12, 20, 22, 23, 57, 58, 59, Hellichova tram no. 12, 20, 22, 23, 57, Pohořelec tram no. 22, 23, Dormitories Strahov BUS No. 143, 149, 217")
      (c = "riegrovy-sady") (println "The activities you can do in this park are: walk, biking, dogs, playground, restaurant, sport, wc attraction like view of Prague, classicist lookout tower, three-sided obelisk and Metro Jiřího z Poděbrad, Na Smetance Bus no. 135, Italská and Vinohradská tržnice tram no. 11")
      (c = "stromovka") (println "The activities you can do in this park are: walk, biking, skating, sport, parking, playgorund, dogs, restaurant, wc attraction like zoo, botanical gardens, natural attractions, planetarium, exhibition grounds and Výstaviště, tram no. 5, 12, 14, 15, 17, 53, 54, Sibiřské nám., Bus no. 131, by steamer from Rašínov nábř")
      (c = "vysehrad") (println "The activities you can do in this park are: walk, biking, parking, sport, playground, wc, attraction like sightseeing, museum, cemetery of famous personalities Slavín, national cultural monument and Vyšehrad - metro C, Podolská vodárna tram no. 3, 16, 17, 21, 52")))
  )
    
;;Main programm

(defn discuss_park 
  []
    (def surname "name")
    (println "Hello ! Welcome to the park discovery chatbot ! What's your name?")
    (def surname (read-line))
    (println (str "Hi  " surname "  nice to meet you"))
    (Joke)
    (activity)
    (park_activity)
    (exit-end)
    )

(defn -main
  []
  (discuss_park)
  );;End
