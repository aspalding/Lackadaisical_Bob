(ns lackadaisical_bob.core)

(defn- empty-string [string]
  (.isEmpty (.trim string)))

(defn shout? [string]
  (and
    (= (.toUpperCase string) string)
    (not (empty-string string))
    (not (empty? (filter #(Character/isLetter  %) string)))))

(defn question? [string]
  (.endsWith string "?"))

(defn silence? [string]
  (empty-string string))

(defn response [string]
  (cond
    (question? string) "Sure."
    (shout? string) "Whoa, Chill out!"
    (silence? string) "Fine. Be that way!"
    :else "Whatever."))

(defn -main []
  (loop [input ""]
    (println (response input))
    (recur (read-line))))
