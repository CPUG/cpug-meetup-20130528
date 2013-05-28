(ns cpug.m20130528
  (:require [clojure.test :as t]))

;; Number spiral diagonals
;; Problem 28
;; Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

;; 21 22 23 24 25
;; 20  7  8  9 10
;; 19  6  1  2 11
;; 18  5  4  3 12
;; 17 16 15 14 13

;; It can be verified that the sum of the numbers on the diagonals is 101.

;; What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn add-right
 [m] )

(t/deftest add-rigth-test
  (t/is (= (add-right [[1]])
           [[  9]
            [1 2]
            [  3]])))

(defn spiral "spiralinig .... " [x] (cond (= x 1) [[1]]
                                          (= x 2) [[1 2] [4 3]]
                                          )) ;; ??



[[1]] {[0 0] 1}

[[7 8 9]
 [6 1 2]
 [5 4 3]]  {

            [1 1] 1

            [1 2] 2
            [2 2] 3
            [2 1] 4

            [2 0] 5
            [1 0] 6

            [0 0] 7
            [0 1] 8
            [0 2] 9 }

[[21 22 23 24 25]
 [20 7  8  9  10]
 [19 6  1  2  11]
 [18 5  4  3  12]
 [17 16 15 14 13]

      ]

(t/deftest spiral-test
  (t/is (= [[1]] (spiral 1)))
  (t/is (= [[1 2]
            [4 3]] (spiral 2)))
  (t/is (= [[7 8 9]
            [6 1 2]
            [5 4 3]] (spiral 3))))

(t/run-tests)
