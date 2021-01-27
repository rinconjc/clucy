(defproject clucy "0.4.1"
  :description "A Clojure interface to the Lucene search engine"
  :url "http://github/weavejester/clucy"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.apache.lucene/lucene-core "8.7.0"]
                 [org.apache.lucene/lucene-queryparser "8.7.0"]
                 [org.apache.lucene/lucene-analyzers-common "8.7.0"]
                 [org.apache.lucene/lucene-highlighter "8.7.0"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}}
  :codox {:src-dir-uri "http://github/weavejester/clucy/blob/master"
          :src-linenum-anchor-prefix "L"})
