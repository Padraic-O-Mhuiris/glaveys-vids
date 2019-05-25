(ns glaveys-vids.events
  (:require
   [re-frame.core :as re-frame]
   [glaveys-vids.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
