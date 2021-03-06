(ns chatbot-dcf.core
  (:gen-class))

;;All the definition/librairies

(def Positif #{"yeah" "Y" "yes" "OK" "y" "ok" "Yes" "Yeah" "fine" "Fine" "Yep" "yep"})
(def theactivity #{"walk" "sport" "skiing" "dogs" "restaurants" "playground" "parking" "biking" "wc" "attraction"})
(def pragueparks #{:a "bertramka" "Bertramka" :b "frantiskanska-zahrada" "Frantiskanska Zahrada"  "Frantiskanska zahrada" "frantiskanska Zahrada" :c"obora-hvezda" "Obora Hvezda" "Obora hvezda" "obora Hvezda" :d"kampa" "Kampa" :e"kinskeho-zahrada" "Kinskeho Zahrada" :f"klamovka" "Klamovka" :g"ladronka" "Ladronka" :h"letna" "Letna" :i"petrin" "Petrin" :j"riegrovy-sady" "Riegrovy Sady" "riegrovy Sady" "Riegrovy sady" :k"stromovka " "Stromovka" :l"vysehrad" "Vysehrad"})
(def exit #{"finish" "Finish" "End" "end" "Exit" "exit" "Stop" "stop" "Bye" "bye" "Quit" "quit" "Leave" "leave"})


;;All the function I use in the programm
(defn not_understand
  []
  (println "Can you retry please I didn't understand"))

;;The exit function that will end the program
(defn exit-end []
  (println "Do really want to leave ?")
  (let [w (read-line)]
    (cond
      (contains? Positif w) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")))
  )



;;Function that will ask wich activity the user wants to do

(defn activity
  []
  (println "What do you want to do today ?")
  (let  [v (read-line)]
    (cond
      (contains? theactivity v) (println "Ok I recommand you to go at a park to do that")
      (contains? exit v) (exit-end)))
  )


(defn Joke
  []
  (println "Do you want to do an Iron-man?")
  (def joke (read-line))
  (println "HAHA it was just a joke don't panic")
  )


;;function that will ask to choose from wich park the user wants more information
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

;;This function will return an answer of all the activity for each park
(defn ParkActivities []
  (choice_park)
  (let [c (read-line)]
    (cond
      (contains? pragueparks c)(println "So" c)
      (contains? exit c) (exit-end)
      :else (not_understand))
    (cond
      (= c "bertramka") (println "the activities you can do in this park are: walk, biking, parking, attraction like cultural monument, classical music concerts, social events, W. A. ??????Mozart Museum and trams No. 4, 7, 9, 10, 58, 59")
      (= c "frantiskanska-zahrada") (println "the activities you can do in this park are: walk, biking, playground, wc, attraction like Church of Our Lady of the Snows and V??clavsk?? n??m??st?? trams. No. 3, 9, 14, 24, 51, 52, 54, 55, 56, 58, metro A, B M??stek")
      (= c "obora-hvezda") (println "the activities you can do in this park are: walk, biking, skiing, playground, dogs, parking, wc, attraction like memorial trees, nature trail, nature attractions and Nad Mark??tou, bus no. 179, 184, 191, 510, Libock?? - bus no. 179, 510, Vypich, tram no. 15, 22, 25, 57")
      (= c "kampa") (println "the activities you can do in this park are: walk, biking, skating, playground, wc, attraction like view of the Vltava, Sovovy Ml??ny Gallery, ??ertovka, Charles Bridge, Werich House, memorial trees and Hellichova tram no. 12, 20, 22, 23, 57, ??jezd ??????tram no. 6, 9, 22, 23, 57, 58, 59")
      (= c "kinskeho-zahrada") (println "the activities you can do in this park are: walk, playground, parking, wc, attraction like museum,ornamental lakes, natural attraction - Petrin Rocks and Kobrova - BUS No. 176")
      (= c "klamovka") (println "the activities you can do in this park are: walk, biking, sport, dogs, restaurant, playground, wc, attraction like art gallery, historical attractions, music club and Klamovka - BUS No. 149, 191, 217, tram No. 4, 7, 9, 10, 58, 59")
      (= c "ladronka") (println "the activities you can do in this park are: walk, biking, parking, skating, restaurant, playground, dogs, wc, attraction like extensive leisure area, music and entertainment events and U Ladronky, Roz??nova, ??tefkova BUS No. 191, Vypich BUS No. 108, 174, 180, 191, I3, tram No. 15, 22, 25, 57")
      (= c "letna") (println "the activities you can do in this park are: walk, biking, playground, dogs, restaurant, skating, parking, wc, attraction like extensive leisure area, cultural events and Letensk?? n??m??st?? and Sparta tram no. 1, 8, 15, 25, 26, 51, 56, ??ech??v most tram no. 12, 17, 53, Chotkovy sady tram no. 18, 20, 57, metro Hrad??ansk??")
      (= c "petrin") (println "the activities you can do in this park are: walk, biking, parking, playground, restaurant, skating, wc,attraction like lookout tower, maze, observatory, underground galleries and fruit orchards and ??jezd ??????tram no. 6, 9, 12, 20, 22, 23, 57, 58, 59, Hellichova tram no. 12, 20, 22, 23, 57, Poho??elec tram no. 22, 23, Dormitories Strahov BUS No. 143, 149, 217")
      (= c "riegrovy-sady") (println "the activities you can do in this park are: walk, biking, dogs, playground, restaurant, sport, wc attraction like view of Prague, classicist lookout tower, three-sided obelisk and Metro Ji????ho z Pod??brad, Na Smetance Bus no. 135, Italsk?? and Vinohradsk?? tr??nice tram no. 11")
      (= c "stromovka") (println "the activities you can do in this park are: walk, biking, skating, sport, parking, playgorund, dogs, restaurant, wc attraction like zoo, botanical gardens, natural attractions, planetarium, exhibition grounds and V??stavi??t??, tram no. 5, 12, 14, 15, 17, 53, 54, Sibi??sk?? n??m., Bus no. 131, by steamer from Ra????nov n??b??")
      (= c "vysehrad") (println "the activities you can do in this park are: walk, biking, parking, sport, playground, wc, attraction like sightseeing, museum, cemetery of famous personalities Slav??n, national cultural monument and Vy??ehrad - metro C, Podolsk?? vod??rna tram no. 3, 16, 17, 21, 52")))
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
  (ParkActivities)
  (exit-end)
  )
 
(defn -main
  []
  (discuss_park)
  )
  ;;End
