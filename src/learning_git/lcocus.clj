;; lmax = V0*sin2alpha/g
;; hmax = V0^2sinalpha^2 / 2g
;; tall = 2V0sinalpha / g
;; tup = tall/2
;; angle, velocity 


(defn maximum-length 
    [velocity alpha]
    (/ (* velocity (Math/sin (* 2 alpha))) 9.81))
(defn maximum-height
    [velocity alpha]
    (let [poweredsin2alpha (Math/pow (Math/sin (* alpha 2)) 2)] 
        (/ (* velocity 2 poweredsin2alpha) (* 2 9.81))))
(defn times
    [velocity alpha]
    (let [t ( Math/abs (/ (* (* velocity 2) (Math/sin alpha)) 9.81))
          tup (/ t 2)]
        (str "t " t (str "tup " tup))))
(format "короче, угол 35 радиан, скорость 700 метров в секунду, отсюдава пролетить этот кал %s метров; там взлетит на %s метров; лететь будет %s" (maximum-length 700 35) (maximum-height 700 35) (times 700 35))