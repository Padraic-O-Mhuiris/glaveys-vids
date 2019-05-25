(ns glaveys-vids.events
  (:require
   [re-frame.core :as rf]
   [glaveys-vids.db :as db]
   ))

(rf/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
