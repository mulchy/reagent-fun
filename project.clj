(defproject reagent-fun "0.1.0-SNAPSHOT"
  :description "Learning about Reagent"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [reagent "0.7.0"]
                 [lein-figwheel "0.5.14"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.14"]]

  :resource-paths ["resources"]

  :cljsbuild
  {:builds {:dev
            {:source-paths ["src"]
             :figwheel {:on-jsload reagent-fun.core/run}
             :compiler
             {:main reagent-fun.core
              :asset-path "js/out"
              :output-to "resources/public/js/app.js"
              :output-dir "resources/public/js/out"
              :source-map       true
              :optimizations :none
              :pretty-print  true}}}})
