(ns reagent-fun.core
  (:require [reagent.core :as r]))

(defn app []
  [:div "Hello World!"])

(defn ^:export run []
  (r/render [app]
            (js/document.getElementById "app")))

(run)
