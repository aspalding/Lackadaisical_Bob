(ns lackadaisical_bob.core-spec
  (:require [speclj.core :refer :all]
            [lackadaisical_bob.core :refer :all]))

(describe "bob's conditions"
  (it "true if shouting"
    (should= true (shout? "HELLO.")))

  (it "numbers != shouting"
    (should= false (shout? "1, 2, 3")))

  (it "true if asking a question"
    (should= true (question? "Hello?")))

  (it "true if asking a question"
    (should= true (question? "4?")))

  (it "false if the question is not at the end of the line"
    (should= false (question? "not a ? question")))

  (it "true if silence"
    (should= true (silence? " "))))

(describe "bobs phrase"
  (it "chill out if shouting"
    (should= "Whoa, Chill out!" (response "HELLO.")))

  (it "sure if asking a question"
    (should= "Sure." (response "Hello?")))

  (it "sure if asking a question about numbers"
    (should= "Sure." (response "4?")))

  (it "be that way if asking a question"
    (should= "Fine. Be that way!" (response " ")))
          
  (it "whatever otherwise"
    (should= "Whatever." (response "This Isn't Shouting!"))))
