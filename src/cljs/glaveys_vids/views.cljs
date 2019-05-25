(ns glaveys-vids.views
  (:require
   [re-frame.core :as rf]
   [glaveys-vids.subs :as s]
   ))

(defn main-panel []
  (let [name (rf/subscribe [::s/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
