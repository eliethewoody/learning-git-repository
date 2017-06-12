(defn solver ;; function solver(a, b, c)
    [a b c]
    (println "лоaдэд")
    (if (= a 0) ;; if a == 0 then return ("Иди поешь говна!") end
        (println "Иди поешь говна!") 
        (let [D (- (* b b) (* 4 a c)) ;; D = b*b - 4*a*c
              -b (- 0 b) 
              a2 (* 2 a)]
              (println "Лет пройден") 
            (if (= D 0) ;; if D == 0 then return (-b/2*a) 
                ((format "питух, у тя 1 корень! на, подавись %s" (/ -b a2)))
                (if (> D 0) ;; if D > 0 then return (-b + sqrt(D))/a*2, (-b - sqrt(D))/a*2 end end end
                   (let [x1 (/ (+ -b (Math/sqrt D)) a2)
                         x2 (/ (- -b (Math/sqrt D)) a2)]
                        (format "питух, у тя 2 корня! На, подавись, %s, %s" x1 x2))
                    (println "Иди поешь говна!"))))))
(solver -9 8 1)