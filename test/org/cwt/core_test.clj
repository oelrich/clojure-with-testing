(ns org.cwt.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [org.cwt.core :as c]))

(deftest factorial-0
  (testing "Testing the factorial function."
    (is (= 1 (c/! 0)))
    (is (= 6 (c/! 3)))
    (is (= 120 (c/! 5))))
  (testing "Should negatives be ok?"
    (is (= 1 (c/! -5)))))