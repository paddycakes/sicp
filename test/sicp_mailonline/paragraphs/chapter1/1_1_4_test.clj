(ns sicp-mailonline.paragraphs.chapter1.1-1-4-test
  (:require [sicp-mailonline.paragraphs.chapter1.1-1-4 :refer :all]
            [clojure.test :refer :all]))

(deftest square-number
  (testing "Should square a number"
    (is (= (square 2) 4))))