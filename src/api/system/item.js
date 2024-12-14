import request from '@/utils/request'

// 查询购物车列表
export function listItem(query) {
  return request({
    url: '/system/item/list',
    method: 'get',
    params: query
  })
}

// 查询购物车详细
export function getItem(id) {
  return request({
    url: '/system/item/' + id,
    method: 'get'
  })
}

// 新增购物车
export function addItem(data) {
  return request({
    url: '/system/item',
    method: 'post',
    data: data
  })
}

// 修改购物车
export function updateItem(data) {
  return request({
    url: '/system/item',
    method: 'put',
    data: data
  })
}

// 删除购物车
export function delItem(id) {
  return request({
    url: '/system/item/' + id,
    method: 'delete'
  })
}
