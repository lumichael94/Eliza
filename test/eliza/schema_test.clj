(ns eliza.schema_test
  (:require [clojure.test :refer :all]
            [eliza.concept_object :refer :all])
  (:use clojure.pprint))

(deftest schema-function-test
  (testing "schema-function test"
    (let [hyperarc (atom (->schema_obj "function"))]
      (is (= "function" (:function @hyperarc))))))

(deftest update-schema-function-test
  (testing "update-schema-function test"
    (let [hyperarc (atom (->schema_obj "function"))]
      (swap! hyperarc assoc :function "changed")
      (is (= "changed" (:function @hyperarc))))))