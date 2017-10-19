(defproject com.adroll.cantor/cantor "1.0.0"
  :description "Fork of AdRoll's cantor"
  :url "https://github.com/AdRoll/cantor"
  :license {:name "MIT"}
  :dependencies [[org.apache.hadoop/hadoop-common "2.7.3"]
                 [org.slf4j/slf4j-api "1.7.5"]]
  :java-source-paths ["src/main/java" "src/test/java"]
  :main ^:skip-aot floop.core
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-pprint "1.1.2"]]
                   :dependencies [[junit/junit "4.11"]]}}
  :plugins [[lein-junit "1.1.8"]]
  ;; Just run junit.
  :junit ["src/test/java"]
  :junit-formatter "xml"
  :junit-results-dir "test-results"
  :aliases {"test" "junit"}
  :repositories [["snapshots"
                  {:url "https://artifactory.yb0t.cc/artifactory/yieldbot-maven-snapshots"
                   :username :env/LEIN_USER
                   :password :env
                   :sign-releases false}]
                 ["releases"
                  {:url "https://artifactory.yb0t.cc/artifactory/yieldbot-maven-releases"
                   :creds :env
                   :sign-releases false}]
                 ["yb" {:url "https://artifactory.yb0t.cc/artifactory/maven"
                        :username :env/LEIN_USER
                        :password :env}]])
