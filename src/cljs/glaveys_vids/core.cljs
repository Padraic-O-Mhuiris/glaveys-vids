(ns glaveys-vids.core
  (:require
   [reagent.core :as r]
   [re-frame.core :as rf]
   [glaveys-vids.events :as e]
   [glaveys-vids.views :as v]
   [glaveys-vids.config :as c]
   ))


(defn dev-setup []
  (when c/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (rf/clear-subscription-cache!)
  (r/render [v/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (rf/dispatch-sync [::e/initialize-db])
  (dev-setup)
  (mount-root))
