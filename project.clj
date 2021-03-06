(defproject com.adroll.cantor/cantor "1.0.4"
  :description "Fork of AdRoll's cantor"
  :url "https://github.com/AdRoll/cantor"
  :license {:name "MIT"}
  :dependencies [[com.google.guava/guava "23.2-jre"]
                 [org.apache.hadoop/hadoop-common "2.7.3"]
                 [org.slf4j/slf4j-api "1.7.5"]]
  :java-source-paths ["src/main/java"]
  :main nil
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-pprint "1.1.2"]]
                   :java-source-paths ["src/test/java"]
                   :dependencies [[org.clojure/clojure "1.8.0"]
                                  [junit/junit "4.11"]]}}
  :plugins [[lein-junit "1.1.8"]]
  ;; Just run junit.
  :junit ["src/test/java"]
  :junit-formatter "xml"
  :junit-results-dir "test-results"
  :aliases {"test" "junit"})
