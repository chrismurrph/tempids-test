(ns app.ui
  (:require [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro-css.localized-dom :as dom]
            [app.operations :as ops]
            [com.fulcrologic.fulcro.algorithms.tempid :as tempid]))

(def pot-rule-tempid (tempid/tempid))

(defsc Rule [this {:db/keys [id]}]
  {:query         [:db/id :rule/text]
   :ident         [:rule/id :db/id]
   :initial-state (fn [_] {:db/id     pot-rule-tempid
                           :rule/text "Must eat porridge every morning"})}
  (dom/button {:onClick #(do
                           (println "Saving rule where id is" id)
                           (comp/transact! this `[(ops/save-rule {:tempid ~id})]))}
              "Resolve"))

(def rule-ui (comp/factory Rule))
