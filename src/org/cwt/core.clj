(ns org.cwt.core
  (:require
   [clojure.string :as str]
   [clojure.pprint :refer [pprint]]
   [clojure.tools.cli :refer [parse-opts]]))


; This is a comment.
(comment
  "This is a syntactically aware comment!"
  (! 7)
  'bye!)
#_(comment "this is a commented out syntactically aware comment." (+ 1 2 3))

;; Here is the factorial function
(defn ! [n]
  (cond
    (> 1 n) 1
    :else
    (* n
       (! (dec n)))))

;; This just defines a vector of arguments to the CLI options parser.
(def cli-options
  [["-n" "--number NUMBER" "Calculate and print the factorial of `n`."
    :id :number
    :parse-fn #(Integer/parseInt %)]
   ["-h" "--help"]])

;; Here is the main function!
(defn -main [& args]
  (let [{:keys [options _arguments _errors summary]}
        (parse-opts args cli-options)]
    (if (:number options)
      (print (! (:number options)))
      (->> ["A Small Factorial Program"
            (if (:help options)
              summary
              "-h or --help to show help.")
            "Good luck on your next Voight-Kampff test!"]
           (str/join \newline)
           print))))