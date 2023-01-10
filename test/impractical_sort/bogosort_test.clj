(ns impractical-sort.bogosort-test
  (:require [clojure.test :refer :all]
            [impractical-sort.bogosort :refer :all]))

(deftest ascending-test
  (testing "ascending? should"
    (testing "return true if sorted in ascending order"
      (is (true? (ascending? [0 1 2])))         ; common case
      (is (true? (ascending? [1])))             ; just one
      (is (true? (ascending? [7 7 7])))         ; all the same
      (is (true? (ascending? [0 1 1 2 2 3]))))  ; multiple duplicate values
    (testing "otherwise return false"
      (is (false? (ascending? [1 0])))          ; reversed simply
      (is (false? (ascending? [0 1 1 3 2])))))) ; dupicate and reversed

(deftest bogosort-test
  (let [coll [9 6 0 7 1 5 2 3 8 4]]
    (testing "Sort in ascending order"
      (is (= (sort coll) (bogosort coll))))
    (testing "Specify pred function to change sort order"
      (is (= (reverse (sort coll)) (bogosort #(apply >= %) coll))))))
