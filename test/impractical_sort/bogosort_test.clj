(ns impractical-sort.bogosort-test
  (:require [clojure.test :refer :all]
            [impractical-sort.bogosort :refer :all]))

(deftest ascending?-test
  (testing "Returns true if sorted in ascending order"
    (is (true? (ascending? [0 1 2])))         ; common case
    (is (true? (ascending? [1])))             ; just one
    (is (true? (ascending? [7 7 7])))         ; all the same
    (is (true? (ascending? [0 1 1 2 2 3])))   ; multiple duplicate values
    (is (true? (ascending? ["a" "b" "c"]))))  ; strings
  (testing "Otherwise return false"
    (is (false? (ascending? [1 0])))          ; reversed simply
    (is (false? (ascending? [0 1 1 3 2]))))) ; dupicate and reversed

(deftest descending?-test
  (testing "Returns true if sorted in descending order"
    (is (true? (descending? [2 1 0])))         ; common case
    (is (true? (descending? [1])))             ; just one
    (is (true? (descending? [7 7 7])))         ; all the same
    (is (true? (descending? [3 2 2 1 1 0])))   ; multiple duplicate values
    (is (true? (descending? ["c" "b" "a"]))))  ; strings
  (testing "Otherwise return false"
    (is (false? (descending? [0 1])))          ; reversed simply
    (is (false? (descending? [2 3 1 1 0])))))

(deftest bogosort-test
  (let [coll [9 6 0 7 1 5 2 3 8 4]]
    (testing "Sort in ascending order"
      (is (= (sort coll) (bogosort coll))))
    (testing "Specify pred function to change sort order"
      (is (= (reverse (sort coll)) (bogosort #(apply >= %) coll))))))
