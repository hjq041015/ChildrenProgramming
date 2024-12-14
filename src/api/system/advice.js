import request from '@/utils/request'

// 查询建议表列表
export function listAdvice(query) {
  return request({
    url: '/system/advice/list',
    method: 'get',
    params: query
  })
}

// 查询建议表详细
export function getAdvice(id) {
  return request({
    url: '/system/advice/' + id,
    method: 'get'
  })
}

// 新增建议表
export function addAdvice(data) {
  return request({
    url: '/system/advice',
    method: 'post',
    data: data
  })
}

// 修改建议表
export function updateAdvice(data) {
  return request({
    url: '/system/advice',
    method: 'put',
    data: data
  })
}

// 删除建议表
export function delAdvice(id) {
  return request({
    url: '/system/advice/' + id,
    method: 'delete'
  })
}
